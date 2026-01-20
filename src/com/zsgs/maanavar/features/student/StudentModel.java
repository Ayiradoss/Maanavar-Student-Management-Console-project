package com.zsgs.maanavar.features.student;

import com.zsgs.maanavar.dto.StudentInfo;
import com.zsgs.maanavar.repository.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentModel {

    private final StudentController studentController;

    public StudentModel(StudentController studentController) {
        this.studentController = studentController;
    }

    public void addStudent(StudentInfo student) {

        if (isStudentExists(student.getStudentId())) {
            studentController.onFailure("Student ID already exists");
            return;
        }

        String query = "INSERT INTO students VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, student.getStudentId());
            ps.setString(2, student.getStudentName());
            ps.setString(3, student.getDepartment());
            ps.setInt(4, student.getYear());

            ps.executeUpdate();
            studentController.onSuccess("Student added successfully");

        } catch (Exception e) {
            e.printStackTrace();
            studentController.onFailure("Database error while adding student");
        }
    }


    private boolean isStudentExists(String studentId) {

        String query = "SELECT student_id FROM student WHERE student_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, studentId);
            ResultSet rs = ps.executeQuery();

            return rs.next(); // true if exists

        } catch (Exception e) {
            return false;
        }
    }



    public void getAllStudents() {

        String query = "SELECT student_id, student_name, department, study_year FROM students";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n--------------------------------------------------");
            System.out.printf("%-6s %-12s %-14s %-4s%n",
                    "ID", "NAME", "DEPARTMENT", "YEAR");
            System.out.println("--------------------------------------------------");

            boolean hasData = false;

            while (rs.next()) {
                hasData = true;
                System.out.printf("%-6s %-12s %-14s %-4d%n",
                        rs.getString("student_id"),
                        rs.getString("student_name"),
                        rs.getString("department"),
                        rs.getInt("study_year"));
            }

            if (!hasData) {
                System.out.println("No students found");
            }

            System.out.println("--------------------------------------------------");

        } catch (Exception e) {
            e.printStackTrace();
            studentController.onFailure("Unable to fetch students");
        }
    }


    public void updateStudent(StudentInfo student) {

        String query = """
        UPDATE students
        SET student_name = ?, department = ?, study_year = ?
        WHERE student_id = ?
    """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, student.getStudentName());
            ps.setString(2, student.getDepartment());
            ps.setInt(3, student.getYear());
            ps.setString(4, student.getStudentId());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                studentController.onSuccess("Student updated successfully");
            } else {
                studentController.onFailure("Student ID not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
            studentController.onFailure("Update failed");
        }
    }


    public void deleteStudent(String studentId) {

        String query = "DELETE FROM students WHERE student_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, studentId);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                studentController.onSuccess("Student deleted successfully");
            } else {
                studentController.onFailure("Student ID not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
            studentController.onFailure("Failed to delete student");
        }
    }

    public void searchStudentById(String studentId) {

        String query = """
        SELECT student_id, student_name, department, study_year
        FROM students
        WHERE student_id = ?
    """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, studentId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("\nStudent Found:");
                System.out.println("---------------------------");
                System.out.println("ID        : " + rs.getString("student_id"));
                System.out.println("Name      : " + rs.getString("student_name"));
                System.out.println("Department: " + rs.getString("department"));
                System.out.println("Year      : " + rs.getInt("study_year"));
                System.out.println("---------------------------");
            } else {
                studentController.onFailure("Student not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
            studentController.onFailure("Error while searching student");
        }
    }

}

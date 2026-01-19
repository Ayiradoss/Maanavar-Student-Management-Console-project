package com.zsgs.maanavar.repository;

import com.zsgs.maanavar.dto.StudentInfo;
import com.zsgs.maanavar.exception.DatabaseException;
import com.zsgs.maanavar.exception.InvalidLoginException;

import java.sql.*;

public class MaanavarDB {

    private static MaanavarDB instance;

    private MaanavarDB() {}

    public static MaanavarDB getInstance() {
        if (instance == null) {
            instance = new MaanavarDB();
        }
        return instance;
    }

    // 🔐 LOGIN
    public boolean isValidUser(String username, String password) {
        String sql = "SELECT 1 FROM users WHERE username=? AND password=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                throw new InvalidLoginException("Invalid username or password");
            }
            return true;

        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (SQLException e) {
            throw new DatabaseException("Login DB error", e);
        }
    }

    // 👨‍🎓 INSERT STUDENT (MATCHES YOUR POJO)
    public void insertStudent(StudentInfo student) {

        String sql =
                "INSERT INTO students(student_id, student_name, department, year) " +
                        "VALUES (?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, student.getStudentId());
            ps.setString(2, student.getStudentName());
            ps.setString(3, student.getDepartment());
            ps.setInt(4, student.getYear());

            ps.executeUpdate();
            System.out.println("Student inserted successfully");

        } catch (SQLException e) {
            throw new DatabaseException("Failed to insert student", e);
        }
    }

    // 👀 VIEW STUDENTS
    public void viewStudents() {

        String sql = "SELECT * FROM students";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                StudentInfo student = new StudentInfo(
                        rs.getString("student_id"),
                        rs.getString("student_name"),
                        rs.getString("department"),
                        rs.getInt("year")
                );

                System.out.println(student);
            }

        } catch (SQLException e) {
            throw new DatabaseException("Failed to fetch students", e);
        }
    }
}

package com.zsgs.maanavar.features.student;

import com.zsgs.maanavar.dto.StudentInfo;

import java.util.Scanner;

public class StudentView {

    private final StudentController studentController;
    private final Scanner sc = new Scanner(System.in);

    public StudentView() {
        studentController = new StudentController(this);
    }

    public void init() {
        while (true) {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student by ID");
            System.out.println("6. Logout");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> studentController.getAllStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> searchStudent();
                case 6 -> {
                    System.out.println("Logged out successfully");
                    return;
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }

    private void addStudent() {
        System.out.print("Student Id: ");
        String id = sc.next();
        System.out.print("Student Name: ");
        String name = sc.next();
        System.out.print("Department: ");
        String dept = sc.next();
        System.out.print("Year: ");
        int year = sc.nextInt();

        StudentInfo student = new StudentInfo(id, name, dept, year);
        studentController.addStudent(student);
    }


    private void updateStudent() {

        System.out.print("Enter Student ID to update: ");
        String id = sc.next();

        System.out.print("New Name: ");
        String name = sc.next();

        System.out.print("New Department: ");
        String dept = sc.next();

        System.out.print("New Year: ");
        int year = sc.nextInt();

        StudentInfo student = new StudentInfo(id, name, dept, year);
        studentController.updateStudent(student);
    }


    private void deleteStudent() {

        System.out.print("Enter Student ID to delete: ");
        String id = sc.next();

        System.out.print("Are you sure you want to delete this student? (Y/N): ");
        String confirm = sc.next();

        if (!confirm.equalsIgnoreCase("Y")) {
            System.out.println("Delete operation cancelled");
            return;
        }

        studentController.deleteStudent(id);
    }

    private void searchStudent() {

        System.out.print("Enter Student ID to search: ");
        String id = sc.next();

        studentController.searchStudentById(id);
    }



    public void showMessage(String message) {
        System.out.println(message);
    }
}

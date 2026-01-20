package com.zsgs.maanavar.features.student;

import com.zsgs.maanavar.dto.StudentInfo;

public class StudentController {

    private final StudentView studentView;
    private final StudentModel studentModel;

    public StudentController(StudentView studentView) {
        this.studentView = studentView;
        studentModel = new StudentModel(this);
    }

    public void addStudent(StudentInfo student) {
        studentModel.addStudent(student);
    }

    public void getAllStudents() {
        studentModel.getAllStudents();
    }

    public void updateStudent(StudentInfo student) {

        if (student.getStudentId() == null || student.getStudentId().isEmpty()) {
            studentView.showMessage("Student ID is required");
            return;
        }

        studentModel.updateStudent(student);
    }


    public void deleteStudent(String studentId) {

        if (studentId == null || studentId.trim().isEmpty()) {
            studentView.showMessage("Student ID cannot be empty");
            return;
        }

        studentModel.deleteStudent(studentId);
    }

    public void searchStudentById(String studentId) {

        if (studentId == null || studentId.trim().isEmpty()) {
            studentView.showMessage("Student ID cannot be empty");
            return;
        }

        studentModel.searchStudentById(studentId);
    }


    public void onSuccess(String msg) {
        studentView.showMessage(msg);
    }

    public void onFailure(String msg) {
        studentView.showMessage(msg);
    }

}

package com.zsgs.maanavar.dto;

import com.zsgs.maanavar.features.student.StudentView;

public class StudentInfo
{
    private String studentId;
    private String studentName;
    private String department;
    private int year;

    public StudentInfo() {}

    public StudentInfo(String studentId, String studentName, String department, int year) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.year = year;
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDepartment() {
        return department;
    }

    public int getYear() {
        return year;
    }

    public void onSuccessLogin() {
        StudentView studentView = new StudentView();
        studentView.init();
    }


    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", department='" + department + '\'' +
                ", year=" + year +
                '}';
    }
}

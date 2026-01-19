package com.zsgs.maanavar.dto;

public class StudentInfo {
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

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

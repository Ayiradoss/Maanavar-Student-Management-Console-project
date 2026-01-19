package com.zsgs.maanavar.dto;

public class FacultyInfo {
    private String facultyId;
    private String facultyName;
    private String department;

    public FacultyInfo() {}

    public FacultyInfo(String facultyId, String facultyName, String department) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.department = department;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "FacultyInfo{" +
                "facultyId='" + facultyId + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

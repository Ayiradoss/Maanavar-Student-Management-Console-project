package com.zsgs.maanavar.dto;

public class SubjectInfo {
    private String subjectId;
    private String subjectName;
    private String facultyId;

    public SubjectInfo() {}

    public SubjectInfo(String subjectId, String subjectName, String facultyId) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.facultyId = facultyId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    @Override
    public String toString() {
        return "SubjectInfo{" +
                "subjectId='" + subjectId + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", facultyId='" + facultyId + '\'' +
                '}';
    }
}

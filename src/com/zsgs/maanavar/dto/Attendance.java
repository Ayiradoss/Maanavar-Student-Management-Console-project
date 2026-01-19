package com.zsgs.maanavar.dto;

public class Attendance {
    private String studentId;
    private String date;
    private boolean present;

    public Attendance() {}

    public Attendance(String studentId, String date, boolean present) {
        this.studentId = studentId;
        this.date = date;
        this.present = present;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "studentId='" + studentId + '\'' +
                ", date='" + date + '\'' +
                ", present=" + present +
                '}';
    }
}

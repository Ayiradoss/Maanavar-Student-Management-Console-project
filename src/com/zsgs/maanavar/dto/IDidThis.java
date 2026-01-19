package com.zsgs.maanavar.dto;

public class IDidThis {
    private String id;
    private String studentId;
    private String action;
    private String dateTime;

    public IDidThis() {}

    public IDidThis(String id, String studentId, String action, String dateTime) {
        this.id = id;
        this.studentId = studentId;
        this.action = action;
        this.dateTime = dateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "IDidThis{" +
                "id='" + id + '\'' +
                ", studentId='" + studentId + '\'' +
                ", action='" + action + '\'' +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}

package com.zsgs.maanavar.dto;

public class StudentFeedback {
    private String feedbackId;
    private String studentId;
    private String message;
    private String date;

    public StudentFeedback() {}

    public StudentFeedback(String feedbackId, String studentId, String message, String date) {
        this.feedbackId = feedbackId;
        this.studentId = studentId;
        this.message = message;
        this.date = date;
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "StudentFeedback{" +
                "feedbackId='" + feedbackId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", message='" + message + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

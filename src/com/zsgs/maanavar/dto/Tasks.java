package com.zsgs.maanavar.dto;

public class Tasks {

    private String taskId;
    private String subjectId;
    private String description;
    private String dueDate;
    private TaskStatus status;

    public Tasks() {}

    public Tasks(String taskId, String subjectId, String description, String dueDate, TaskStatus status) {
        this.taskId = taskId;
        this.subjectId = subjectId;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "taskId='" + taskId + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", description='" + description + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", status=" + status +
                '}';
    }
}


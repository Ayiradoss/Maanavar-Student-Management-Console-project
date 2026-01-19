package com.zsgs.maanavar.dto;

public class ScheduleInfo {
    private String scheduleId;
    private String subjectId;
    private String slotId;
    private String date;

    public ScheduleInfo() {}

    public ScheduleInfo(String scheduleId, String subjectId, String slotId, String date) {
        this.scheduleId = scheduleId;
        this.subjectId = subjectId;
        this.slotId = slotId;
        this.date = date;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ScheduleInfo{" +
                "scheduleId='" + scheduleId + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", slotId='" + slotId + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

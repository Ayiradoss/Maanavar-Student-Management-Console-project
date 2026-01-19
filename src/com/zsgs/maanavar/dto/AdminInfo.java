package com.zsgs.maanavar.dto;

public class AdminInfo {
    private String adminId;
    private String adminName;
    private String contact;

    public AdminInfo() {}

    public AdminInfo(String adminId, String adminName, String contact) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.contact = contact;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "AdminInfo{" +
                "adminId='" + adminId + '\'' +
                ", adminName='" + adminName + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}

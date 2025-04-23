package com.puruvas.StudentSelfReflection.constants;

public enum AttendanceStatus {

    ABSENT("ABSENT"),
    PRESENT("PRESENT"),
    LEAVE("LEAVE");

    private String status;

    private AttendanceStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

}
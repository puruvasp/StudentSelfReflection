package com.puruvas.StudentSelfReflection.constants;

public enum PaymentStatus {
    PENDING("PENDING"),
    PAID("PAID"),
    PARTIALLY_PAID("PARTIALLY_PAID"),
    OVERDUE("OVERDUE");

    private final String sPaymentStatus;

    private PaymentStatus(String sPaymentStatus)
    {
        this.sPaymentStatus = sPaymentStatus;
    }

    public String getSPaymentStatus()
    {
        return this.sPaymentStatus;
    }
}

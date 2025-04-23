package com.puruvas.StudentSelfReflection.constants;

public enum ModeOfPayment {

        CASH("CASH"),
        UPI("UPI"),
        CARD("CARD"),
        BANK_TRANSFER("BANK_TRANSFER");

        private final String nModeOfPayment;

        private ModeOfPayment(String nModeOfPayment)
        {
            this.nModeOfPayment = nModeOfPayment;
        }
        public String getNModeOfPayment()
        {
            return this.nModeOfPayment;
        }
}

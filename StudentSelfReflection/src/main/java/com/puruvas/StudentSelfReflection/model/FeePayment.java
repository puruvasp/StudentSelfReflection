package com.puruvas.StudentSelfReflection.model;

import com.puruvas.StudentSelfReflection.constants.ModeOfPayment;
import com.puruvas.StudentSelfReflection.constants.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;




@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class FeePayment extends BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feePaymentId;

    private Double amountPaid;

    private Double totalFee;

    private Boolean isDiscountApplied;

    private Double discountAmount;

    private Double finalAmountDue;

    private LocalDate paymentDate;

    @Enumerated(EnumType.STRING)
    private ModeOfPayment eModeOfPayment;

    @Enumerated(EnumType.STRING)
    private PaymentStatus ePaymentStatus;

    private Integer installmentNumber;

    private Integer nAssignedInstallmentNumber;

    private String remarks;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "studentId")
    private StudentUser studentUser;

}
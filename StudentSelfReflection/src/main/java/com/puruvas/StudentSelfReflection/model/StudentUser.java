package com.puruvas.StudentSelfReflection.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentUser extends Users
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(unique = true)
    private String rollNumber;

    private LocalDate dateOfBirth;

    @OneToMany
    private Set<Attendance> attendances;

    @OneToMany
    private Set<FeePayment> feePayments;

    @ManyToMany
    private Set<Course> courses;
}

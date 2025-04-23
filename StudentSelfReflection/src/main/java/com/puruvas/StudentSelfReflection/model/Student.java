package com.puruvas.StudentSelfReflection.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private UUID rollnumber;
    private LocalDate dob;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    Set<Attendance> attendanceSet = new HashSet<>();

}

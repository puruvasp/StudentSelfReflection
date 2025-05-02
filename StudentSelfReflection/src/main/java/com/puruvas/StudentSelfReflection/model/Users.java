package com.puruvas.StudentSelfReflection.model;

import jakarta.persistence.*;


@MappedSuperclass
public class Users
{
    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    @Transient
    private String confirmEmail;

    private String pwd;

    @Transient
    private String confirmPwd;

    @OneToOne(fetch = FetchType.EAGER)
    private Roles role;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Address address;
}
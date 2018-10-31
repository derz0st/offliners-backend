package com.offliners.userservice.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@Builder
@Table(name = "usr")
public class User {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "fist_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "birthday_date")
    private LocalDate birthday;
    @Column(name = "bio")
    private String bio;
    @Column(name = "facebook")
    private String facebook;
}

package com.pluralsight.EventTracker.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "attendees", schema = "public", catalog = "conference_app")
public @Data class Attendee {
    @Id
    @Column(name = "attendee_id", nullable = false)
    private Integer attendeeId;
    @Basic
    @Column(name = "first_name", nullable = false, length = 30)
    private String firstName;
    @Basic
    @Column(name = "last_name", nullable = false, length = 30)
    private String lastName;
    @Basic
    @Column(name = "title", nullable = true, length = 40)
    private String title;
    @Basic
    @Column(name = "company", nullable = true, length = 50)
    private String company;
    @Basic
    @Column(name = "email", nullable = false, length = 80)
    private String email;
    @Basic
    @Column(name = "phone_number", nullable = true, length = 20)
    private String phoneNumber;
    @Basic
    @Column(name = "enabled", nullable = false)
    private Boolean enabled;
    @Basic
    @Column(name = "password", nullable = false, length = 100)
    private String password;
    @OneToMany(mappedBy = "attendeesByAttendeeId")
    private Collection<AttendeeAuthority> attendeeAuthorities;
}

package com.pluralsight.EventTracker.Entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "attendees", schema = "public", catalog = "conference_app")
public class Attendee {
    private Integer attendeeId;
    private String firstName;
    private String lastName;
    private String title;
    private String company;
    private String email;
    private String phoneNumber;
    private Boolean enabled;
    private String password;
    private Collection<AttendeeAuthority> attendeeAuthorities;

    @Id
    @Column(name = "attendee_id", nullable = false)
    public Integer getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(Integer attendeeId) {
        this.attendeeId = attendeeId;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 30)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 30)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 40)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "company", nullable = true, length = 50)
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 80)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone_number", nullable = true, length = 20)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "enabled", nullable = false)
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attendee attendee = (Attendee) o;
        return Objects.equals(attendeeId, attendee.attendeeId) &&
                Objects.equals(firstName, attendee.firstName) &&
                Objects.equals(lastName, attendee.lastName) &&
                Objects.equals(title, attendee.title) &&
                Objects.equals(company, attendee.company) &&
                Objects.equals(email, attendee.email) &&
                Objects.equals(phoneNumber, attendee.phoneNumber) &&
                Objects.equals(enabled, attendee.enabled) &&
                Objects.equals(password, attendee.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attendeeId, firstName, lastName, title, company, email, phoneNumber, enabled, password);
    }

    @OneToMany(mappedBy = "attendeesByAttendeeId")
    public Collection<AttendeeAuthority> getAttendeeAuthorities() {
        return attendeeAuthorities;
    }

    public void setAttendeeAuthorities(Collection<AttendeeAuthority> attendeeAuthoritiesByAttendeeId) {
        this.attendeeAuthorities = attendeeAuthoritiesByAttendeeId;
    }
}

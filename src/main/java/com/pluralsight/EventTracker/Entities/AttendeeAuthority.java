package com.pluralsight.EventTracker.Entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "attendee_authority", schema = "public", catalog = "conference_app")
public class AttendeeAuthority {
    private Integer id;
    private String authority;
    private Attendee attendeesByAttendeeId;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "authority", nullable = false, length = 50)
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttendeeAuthority that = (AttendeeAuthority) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(authority, that.authority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, authority);
    }

    @ManyToOne
    @JoinColumn(name = "attendee_id", referencedColumnName = "attendee_id", nullable = false)
    public Attendee getAttendeesByAttendeeId() {
        return attendeesByAttendeeId;
    }

    public void setAttendeesByAttendeeId(Attendee attendeesByAttendeeId) {
        this.attendeesByAttendeeId = attendeesByAttendeeId;
    }
}

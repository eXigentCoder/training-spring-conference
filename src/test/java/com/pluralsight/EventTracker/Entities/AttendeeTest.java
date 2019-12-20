package com.pluralsight.EventTracker.Entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AttendeeTest {

    private Attendee attendee;

    @BeforeEach
    void Init(){
        attendee = new Attendee();
        attendee.setAttendeeId(1);
        attendee.setFirstName("Ryan");
        attendee.setLastName("Kotzen");
        attendee.setTitle("Mr");
        attendee.setCompany("Entelect");
        attendee.setEmail("ryank@entelect.co.za");
        attendee.setPhoneNumber("555 555 5555");
        attendee.setEnabled(true);
        attendee.setPassword("bob123#");
    }
    @Test
    void getAttendeeId() {
        Assertions.assertEquals(attendee.getAttendeeId(),1);
    }

    @Test
    void setAttendeeId() {
        attendee.setAttendeeId(2);
        Assertions.assertEquals(attendee.getAttendeeId(),2);
    }

    @Test
    void getFirstName() {
        Assertions.assertEquals(attendee.getFirstName(),"Ryan");
    }

    @Test
    void setFirstName() {
        attendee.setFirstName("Bob");
        Assertions.assertEquals(attendee.getFirstName(),"Bob");
    }

}
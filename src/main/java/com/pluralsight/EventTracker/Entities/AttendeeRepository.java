package com.pluralsight.EventTracker.Entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee, Integer> {
    public Attendee findOneByEmail(String email);
}

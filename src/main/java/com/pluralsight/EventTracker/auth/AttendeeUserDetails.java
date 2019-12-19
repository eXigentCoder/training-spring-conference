package com.pluralsight.EventTracker.auth;

import com.pluralsight.EventTracker.Entities.Attendee;
import com.pluralsight.EventTracker.Entities.AttendeeAuthority;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class AttendeeUserDetails implements UserDetails {

    private Collection<AttendeeAuthority> attendeeAuthorities;
    private Boolean isEnabled;
    private String password;
    private String username;

    public AttendeeUserDetails(Attendee attendee){
        System.out.println("-----======================[ AttendeeUserDetails ]");
        System.out.println(attendee);
        this.attendeeAuthorities = new ArrayList<AttendeeAuthority>();
        this.isEnabled = attendee.getEnabled();
        this.password = attendee.getPassword();
        this.username = attendee.getEmail();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return attendeeAuthorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}

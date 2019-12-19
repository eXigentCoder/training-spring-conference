package com.pluralsight.EventTracker.auth;

import com.pluralsight.EventTracker.Entities.Attendee;
import com.pluralsight.EventTracker.Entities.AttendeeAuthority;
import com.pluralsight.EventTracker.Entities.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CustomUserDetailService implements UserDetailsService {

    User.UserBuilder builder = null;

    @Autowired
    private AttendeeRepository attendeeRepository;

//    @Autowired
//    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var encoder = new BCryptPasswordEncoder();
        builder = org.springframework.security.core.userdetails.User.withUsername("a");
        builder.password(encoder.encode("a"));
        builder.roles("ADMIN", "USER");
        //builder.authorities("ADMIN", "USER");
        //builder.roles(user.getRoles());
        var user = builder.build();
        return user;
//
//
//        var attendee = attendeeRepository.findOneByEmail(username);
//        if(attendee == null){
////            attendee = new Attendee();
////            attendee.setAttendeeId(1);
////            attendee.setFirstName("Ryan");
////            attendee.setLastName("Kotzen");
////            attendee.setTitle("Mr");
////            attendee.setCompany("Entelect");
////            attendee.setEmail("ryank@entelect.co.za");
////            attendee.setPhoneNumber("555 555 5555");
////            attendee.setEnabled(true);
////            attendee.setPassword(encoder.encode("bob123#"));
////            attendeeRepository.saveAndFlush(attendee);
////            System.out.println(attendee);
//            throw new UsernameNotFoundException("Username \""+ username +"\" not found.");
//        }
//
//        //return new AttendeeUserDetails(attendee);
    }
}

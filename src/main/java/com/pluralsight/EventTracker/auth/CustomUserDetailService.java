package com.pluralsight.EventTracker.auth;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService {

//    @Autowired
//    private AttendeeRepository attendeeRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        throw new UsernameNotFoundException("COming soon");
//        var user = attendeeRepository.findOneByEmail(username);
//        return user;
    }


//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//
//        User user = getUserFromDatabase();
//
//        UserItem userItem =  new UserItem(user.getUsername(),user.getPassword(),true,true,true,true, new ArrayList<GrantedAuthority>());;
//
//        userItem.setAuthorities(AuthorityUtils.createAuthorityList("ROLE_ADMIN", "ROLE_USER"));
//        return userItem;
//    } {
}

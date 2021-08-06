package com.example.openapidemo.auth;

import com.example.openapidemo.model.User;
import com.example.openapidemo.service.UserService;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SpringUserService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username : " + username);
        User user = userService.getUserByEmail(username);
        System.out.println("password : " + user.getPassword());

//        BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
//        String hashPass = bcryptPasswordEncoder.encode("abcd");
//        System.out.println(hashPass);
//
//        boolean f = bcryptPasswordEncoder.matches("abcd",hashPass);
//        System.out.println(f);

        return new SpringUser(user);
    }
}

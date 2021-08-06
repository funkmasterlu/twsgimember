package com.example.openapidemo.auth;

import com.example.openapidemo.entity.UserAuthority;
import com.example.openapidemo.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SpringUser implements UserDetails {
    private User user;

    public SpringUser(User user) {
        this.user = user;
    }

    public int getId() {
        return user.getId();
    }

    public String getName() {
        return user.getName();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<UserAuthority> userAuthorityList = new ArrayList<>();
        userAuthorityList.add(UserAuthority.ADMIN);
        return userAuthorityList.stream()
                .map(auth -> new SimpleGrantedAuthority(auth.name()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

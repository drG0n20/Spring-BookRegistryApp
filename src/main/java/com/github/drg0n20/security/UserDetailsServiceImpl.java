package com.github.drg0n20.security;

import com.github.drg0n20.model.User;
import com.github.drg0n20.repositiories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findOneByUsername(username);

        if (user == null){
            throw new UsernameNotFoundException("User not found");
        }

        return new UserDetailsImpl (user.getUsername(), user.getPassword());
    }
}


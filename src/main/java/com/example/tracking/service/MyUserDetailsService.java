package com.example.tracking.service;

import com.example.tracking.models.User;
import com.example.tracking.models.UserPrincipal;
import com.example.tracking.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
  
    @Autowired 
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException(" User  not found");
        }
         
        return  new UserPrincipal(user);
    }
  
}
package com.sink.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sink.repository.core.UserGroupRepository;
import com.sink.repository.core.UserRepository;

@Service
@Transactional
public class UserDetailsServiceImpl  implements UserDetailsService {
    
    @Autowired UserRepository userRepo;
    @Autowired UserGroupRepository groupRepo;
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.sink.domain.core.User u = userRepo.findUserByName(username);
        org.springframework.security.core.userdetails.User uu = new User(u.getUsername(),u.getPassword(),u.isActive(),true, true, true, AuthorityUtils.NO_AUTHORITIES); 
        return uu;
    }
    
}

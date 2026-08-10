package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepository;
import com.example.demo.entity.UserEntity;

@Service
public class CustomUserSecurityUserDetails implements UserDetailsService {
	@Autowired
	private UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserEntity user = repo.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("user not found please enter correct details"));
		return User.builder().username(user.getUsername())
				.password(user.getPassword())
				.roles(user.getRole())
				.build();
	}

}

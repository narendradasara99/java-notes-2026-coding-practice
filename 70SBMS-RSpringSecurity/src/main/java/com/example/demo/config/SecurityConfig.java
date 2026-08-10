package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration	
public class SecurityConfig {
	@Bean
	public BCryptPasswordEncoder get() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails userDetails = User.builder().username("narendra").password(get().encode("1234")).roles("ADMIN").build();
		UserDetails userDetails2= User.builder().username("ramya").password(get().encode("ramya")).roles("USER").build();

		
		return new InMemoryUserDetailsManager(userDetails,userDetails2);
		
	}

}

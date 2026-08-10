package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Bean
	public PasswordEncoder en() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService userd() {

		UserDetails userDetails = User.builder().username("narendra").password(en().encode("143")).roles("user")
				.build();
		
		System.out.println(en().encode("narendra"));
		return new InMemoryUserDetailsManager(userDetails);
	}
	
	public SecurityFilterChain filter(HttpSecurity h) throws Exception {
		
		h.csrf(csrf->csrf.disable()).authorizeHttpRequests(a->a.requestMatchers("/hello").permitAll().anyRequest().authenticated()).httpBasic();
		
		return h.build();
		
	}

}

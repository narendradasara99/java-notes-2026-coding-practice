package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	@Bean
	public BCryptPasswordEncoder encode() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();

	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity h) throws Exception {

		h.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(auth -> auth.requestMatchers("hello").permitAll()
						.requestMatchers("/h2-console/**").permitAll().requestMatchers("/admin").hasRole("ADMIN")
						.requestMatchers("/manager").hasRole("MANAGER").requestMatchers("/user")
						.hasAnyRole("USER", "ADMIN").anyRequest().authenticated()

				).headers(headers -> headers.frameOptions().disable()).httpBasic();

		return h.build();

	}

}

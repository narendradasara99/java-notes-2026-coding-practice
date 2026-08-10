package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	@Bean
	public PasswordEncoder bc() {
		System.out.println(new BCryptPasswordEncoder().encode("1234"));
		System.out.println(new BCryptPasswordEncoder().encode("admin123"));
		System.out.println(new BCryptPasswordEncoder().encode("manager123"));

		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationManager am(AuthenticationConfiguration c) throws Exception {
		return c.getAuthenticationManager();
	}

	@Bean
	public SecurityFilterChain sec(HttpSecurity se) throws Exception {
		se.csrf(c -> c.disable())
				.authorizeHttpRequests(a -> a.requestMatchers("/hello").permitAll().requestMatchers("/h2-console/**")
						.permitAll().requestMatchers("/admin").hasRole("ADMIN").requestMatchers("/manager")
						.hasRole("MANAGER").requestMatchers("/user").hasAnyRole("USER", "ADMIN").anyRequest()
						.authenticated())
				.headers(headers -> headers.frameOptions().disable()).httpBasic();

		return se.build();
	}

}

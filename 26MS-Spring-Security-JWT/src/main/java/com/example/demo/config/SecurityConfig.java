package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.jwt.JwtFilter;

import jakarta.servlet.Filter;

@Configuration
public class SecurityConfig {
	@Autowired
	public JwtFilter filter;
	
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
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            // Disable CSRF (REST API + JWT)
            .csrf(csrf -> csrf.disable())

            // Authorization Rules
            .authorizeHttpRequests(auth -> auth

                // Public Endpoints
                .requestMatchers(
                        "/auth/login",
                        "/h2-console/**"
                ).permitAll()

                // Role Based Endpoints
                .requestMatchers("/admin").hasRole("ADMIN")
                .requestMatchers("/manager").hasRole("MANAGER")
                .requestMatchers("/user").hasAnyRole("USER", "ADMIN")

                // All Other Requests
                .anyRequest().authenticated()
            )

            // Stateless Session (JWT)
            .sessionManagement(session ->
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            )

            // Allow H2 Console Frames
            .headers(headers ->
                headers.frameOptions(frame -> frame.disable())
            )

            // Add JWT Filter
            .addFilterBefore(filter, (Class<? extends Filter>) UsernamePasswordAuthenticationFilter.class);

        return http.build();
    

	}

}

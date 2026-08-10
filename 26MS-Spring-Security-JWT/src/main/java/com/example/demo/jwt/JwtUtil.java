package com.example.demo.jwt;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
	private final String SECRET_KEY = "mySuperSecureJwtSecretKey1234567890";

	private final long EXPIRATION = 1000 * 60 * 60; // 1 hour

	public String generateToken(String username) {
		String compact = Jwts.builder().setSubject(username).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
				.signWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()), SignatureAlgorithm.HS256).compact();

		return compact;
	}

	public String extractUsername(String token) {

		String subject = Jwts.parserBuilder().setSigningKey(SECRET_KEY.getBytes()).build().parseClaimsJws(token)
				.getBody().getSubject();

		return subject;
	}

	public boolean validateToken(String token) {
		extractUsername(token);
		return true;
	}

}

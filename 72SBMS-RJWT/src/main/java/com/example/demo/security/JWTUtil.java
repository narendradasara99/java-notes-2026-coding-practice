package com.example.demo.security;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JWTUtil {

	private final String SECRET_KEY = "mySuperSecureJwtSecretKey1234567890";
	private final long EXPIRATION = 1000 * 60 * 60; // 1 hour

	public String generateToken(String uname) {

		String compact = Jwts.builder().setSubject(uname).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + EXPIRATION))
				.signWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()), SignatureAlgorithm.HS256).compact();

		System.out.println("GTOKEN" + compact);

		return compact;
	}

	public String extractUsername(String token) {

		String subject = Jwts.parserBuilder().setSigningKey(SECRET_KEY.getBytes()).build().parseClaimsJws(token)
				.getBody().getSubject();
		System.out.println("euname" + subject);
		return subject;
	}
    public boolean validateToken(String token) {
        extractUsername(token);
        return true;
    }


}

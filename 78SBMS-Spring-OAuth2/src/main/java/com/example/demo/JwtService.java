package com.example.demo;

import java.nio.charset.StandardCharsets;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {
	 private final String SECRET_KEY =
	            "mySecretKeyForJwtAuthenticationApplication123456";

	    public String generateToken(UserDetails userDetails) {

	        return Jwts.builder()
	                .subject(userDetails.getUsername())
	                .issuedAt(new Date())
	                .expiration(
	                        new Date(
	                            System.currentTimeMillis()
	                            + 1000 * 60 * 30
	                        )
	                )
	                .signWith(getSignKey())
	                .compact();
	    }

	    public String extractUsername(String token) {

	        return extractAllClaims(token).getSubject();
	    }

	    public boolean isTokenValid(
	            String token,
	            UserDetails userDetails) {

	        String username = extractUsername(token);

	        return username.equals(userDetails.getUsername())
	                && !isTokenExpired(token);
	    }

	    private boolean isTokenExpired(String token) {

	        return extractAllClaims(token)
	                .getExpiration()
	                .before(new Date());
	    }

	    private Claims extractAllClaims(String token) {

	        return Jwts.parser()
	                .verifyWith(getSignKey())
	                .build()
	                .parseSignedClaims(token)
	                .getPayload();
	    }

	    private SecretKey getSignKey() {

	        return Keys.hmacShaKeyFor(
	                SECRET_KEY.getBytes(StandardCharsets.UTF_8)
	        );
	    }
	

}

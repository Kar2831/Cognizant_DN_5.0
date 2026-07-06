package com.example.spring_jwt.service;

import com.example.spring_jwt.BasicAuthParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@Service
public class JwtService {

    private final String SECRET_KEY = "your-super-secret-secure-key-32-bytes-long!";

    public String authenticateAndGenerateToken(String authHeader){
        String[] credentials = BasicAuthParser.parseHeader(authHeader);
        String username = credentials[0];
        String password = credentials[1];

        if("user".equals(username) && "pwd".equals(password)) {
            return generateJwtToken(username);
        }else{
            throw new IllegalArgumentException("Invalid username or password");
        }
    }

    private String generateJwtToken(String username){
        SecretKey key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        Date expiryDate = new Date(nowMillis + 900000);

        return Jwts.builder()
                .subject(username)
                .issuedAt(now)
                .expiration(expiryDate)
                .signWith(key)
                .compact();
    }
}

package com.example.spring_jwt;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class BasicAuthParser {

    public static String[] parseHeader(String authHeader){
        String base64Credentials = authHeader.substring(6).trim();
        byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(credDecoded, StandardCharsets.UTF_8);
        return credentials.split(":", 2);
    }

}

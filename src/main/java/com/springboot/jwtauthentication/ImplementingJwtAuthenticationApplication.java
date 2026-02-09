package com.springboot.jwtauthentication;

import com.springboot.jwtauthentication.utils.JwtUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImplementingJwtAuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImplementingJwtAuthenticationApplication.class, args);

//        JwtUtils jwt = new JwtUtils();
//
//    String token = jwt.generateToken("Bob");
//    System.out.println("Generated Token:");
//    System.out.println(token);
//
//    System.out.println("\nValidation:");
//    System.out.println(jwt.validateToken(token, "Bob"));
    }
}
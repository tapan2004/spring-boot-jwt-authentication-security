package com.springboot.jwtauthentication.service;

import com.springboot.jwtauthentication.entity.Role;
import com.springboot.jwtauthentication.entity.RoleName;
import com.springboot.jwtauthentication.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner initRoles(RoleRepository roleRepository) {
        return args -> {
            if (roleRepository.count() == 0) {
                roleRepository.save(new Role(null, RoleName.USER));
                roleRepository.save(new Role(null, RoleName.ADMIN));
                System.out.println("Default roles inserted");
            }
        };
    }
}
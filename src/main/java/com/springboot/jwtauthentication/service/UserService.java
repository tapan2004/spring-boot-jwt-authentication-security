package com.springboot.jwtauthentication.service;

import com.springboot.jwtauthentication.entity.Role;
import com.springboot.jwtauthentication.entity.User;
import com.springboot.jwtauthentication.repository.RoleRepository;
import com.springboot.jwtauthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RoleRepository roleRepository;

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findByName(String name) {
        return userRepository.findByUsername(name);
    }

    public User createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        String requestedRole = user.getUserRole();
        if (requestedRole == null) {
            requestedRole = "USER";   // default
        }
        String finalRole = requestedRole.equalsIgnoreCase("ADMIN") ? "ADMIN" : "USER";
        Role role = roleRepository.findAll()
                .stream()
                .filter(r -> r.getUserRole().name().equals(finalRole))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Role " + finalRole + " not found"));
        user.setRoles(Set.of(role));
        return userRepository.save(user);
    }

    public void updateUser(String username, User user) {
        User existing = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setUsername(username);
        if (user.getPassword() != null && !user.getPassword().isBlank()) {
            existing.setPassword(passwordEncoder.encode(user.getPassword()));
        }
        if (user.getEmail() != null) {
            existing.setEmail(user.getEmail());
        }
        userRepository.save(existing);
    }
}
package com.springboot.jwtauthentication.repository;

import com.springboot.jwtauthentication.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}

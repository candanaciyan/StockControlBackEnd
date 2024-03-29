package com.tobeto.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entity.Role;

public interface RoleRepository extends JpaRepository<Role, UUID>{

}

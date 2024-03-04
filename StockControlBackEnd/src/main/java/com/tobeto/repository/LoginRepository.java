package com.tobeto.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tobeto.entity.Login;

public interface LoginRepository extends JpaRepository<Login, UUID>{

}

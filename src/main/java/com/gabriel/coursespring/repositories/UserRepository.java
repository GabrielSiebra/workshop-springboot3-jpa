package com.gabriel.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.coursespring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

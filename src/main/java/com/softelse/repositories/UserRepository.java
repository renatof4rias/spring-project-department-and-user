package com.softelse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softelse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

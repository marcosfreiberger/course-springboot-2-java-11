package com.freiberger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freiberger.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

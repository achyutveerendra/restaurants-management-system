package com.restaurant.rms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.rms.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

}

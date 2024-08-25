package com.restaurant.rms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.restaurant.rms.models.User;
import com.restaurant.rms.repositories.UserRepository;

@Service
public class UserService {
	 @Autowired
	 private UserRepository userRepository;

	 @Autowired
	 private PasswordEncoder passwordEncoder;

	    public User registerUser(User user) {
	        user.setPassword(passwordEncoder.encode(user.getPassword()));
	        return userRepository.save(user);
	    }

	    public User findByUsername(String username) {
	        return userRepository.findByUsername(username);
	    }
	    public User authenticate(String username, String password) {
	        User user = userRepository.findByUsername(username);
	        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
	            return user;
	        }
	        return null;
	    }
}

package com.build.socialApp.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.build.socialApp.Entity.User;
import com.build.socialApp.repository.UserRepository;

@Service
public class userService {
	
	@Autowired
	private final UserRepository UserRepository;
	public userService(UserRepository UserRepository) {
		this.UserRepository = UserRepository;
	}
	
	public User submitMetaDataOfUser(User user) {
		return UserRepository.save(user);
	}
	
	public List<User> retrieveAllUserDetails() {
		return UserRepository.findAll();
	}
	
	public Optional<User> getUserData(Long userID) {
		return UserRepository.findById(userID);
	}
}

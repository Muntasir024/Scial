package com.build.socialApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.build.socialApp.Entity.User;
import com.build.socialApp.service.userService;

@CrossOrigin
@RestController
@RequestMapping("/api/userService")
public class userController {
	@Autowired
	private final userService UserService;
	public userController(userService UserService) {
		this.UserService = UserService;
	}
	
	@PostMapping("/save")
	public User saveUserMetaData(@RequestBody User user) {
		return UserService.submitMetaDataOfUser(user);
	}
	
	@GetMapping("/getUserDetails")
	public List<User> getAllUserDetails() {
		return UserService.retrieveAllUserDetails();
	}
	
	@GetMapping("/getAllUsers/{userID}")
	public Optional<User> getUserDetail(@PathVariable("userID") Long userID) {
		return UserService.getUserData(userID);
	}
}

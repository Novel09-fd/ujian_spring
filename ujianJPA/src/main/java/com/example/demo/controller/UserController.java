package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> user){
		return userService.saveUsers(user);
	}
	
	@GetMapping("/getUserByName/{name}")
	public User findByName(@PathVariable String name) {
		return userService.getUserByName(name);
	}
	
	@GetMapping("/getUserByFirstName/{firstName}")
	public User findByFirstName (@PathVariable String firstName) {
		return userService.getUserFirstName(firstName);
	}
	
	@GetMapping ("/getUserByCompanyId/{company_id}")
	public User findBycompanyId (@PathVariable String company_id) {
		return userService.getUserByCompanyId(company_id);
	}
	
}

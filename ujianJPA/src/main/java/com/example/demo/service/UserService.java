package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> saveUsers (List<User> user){
		return userRepository.saveAll(user);
	}
	
	public User getUserByName (String name) {
		return userRepository.findByName(name);
	}
	
	public User getUserFirstName (String name) {
		return userRepository.findByFirstName(name);
	}
	
	public User getUserByCompanyId (String company_id) {
		return userRepository.findByCompanyId(company_id);
	}
}

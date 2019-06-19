package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public String addNewUser ( String name, String password) {
		
		User n = new User();
		n.setUsername(name);
		n.setPassword(password);
		n.setPasswordConfirm("temp");
		userRepository.save(n);
		return "Saved";
	}
	

}

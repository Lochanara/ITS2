package com.example.demo.controller;

/**
 * @author Ekanayaketw
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.UserService;

@RestController
@RequestMapping(path="/demo") 
public class UserController {
	
	@Autowired 
	private UserService userservice;

	@GetMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String password) {
		userservice.addNewUser(name, password);
		return "Saved";
	}
	
	@GetMapping(path="/")
	public @ResponseBody String home() {
		return "success";
	}

	/*@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		//return userRepository.findAll();
	}*/
}
package com.firoztechi.UserApp.UserApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firoztechi.UserApp.UserApp.Entity.ResponseTemplate;
import com.firoztechi.UserApp.UserApp.Entity.UserDetail;
import com.firoztechi.UserApp.UserApp.Service.UserService;

@RestController
public class UserController {
    
	@Autowired
	private UserService userService;
	@GetMapping("/")
	public String helloUseApp() {
		//return "Hello User Application";
		return "index";
	}
	@PostMapping("/users")
	public UserDetail saveUser(@RequestBody UserDetail user) {
		System.out.println(user);
		return userService.saveUser(user);
	}
	@GetMapping("/users/{id}")
	public ResponseTemplate getUserwithDepartment(@PathVariable("id") Long userId) {
	
		return userService.getUserWithDepartment(userId);
	}
}

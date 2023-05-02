package com.example.cricket.Controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cricket.Service.userService;
import com.example.cricket.model.user;

@RestController

public class userController {
	@Autowired
	userService usrService;
	@PostMapping("/checkLogin")
		public String validateUser(@RequestBody User u)
		{
		System.out.println(u.getUsername());
			return usrService.validateuser(u.getUsername(),u.getPassword());
		}
	@PostMapping("/addUser")
	public user user(@RequestBody user u)
	{
	return usrService.saveuser(u);
	}
	}



package com.example.cricket.Service;

//import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cricket.Repository.userRepository;
import com.example.cricket.model.user;

@Service

public class userService {
	@Autowired
	userRepository userRepo;
public user saveuser(user u)
{
return userRepo.save(u);
}
public String validateuser(String username,String password)
{
	String result="";
	user u=userRepo.findByUsername(username);
	if(u==null)
	{
		result="Invalid user";
	}
		else
		{
			if(u.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
	

	return result;
	}
	
	
}



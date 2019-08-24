 package com.example.stockspring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.UserDao;
import com.example.stockspring.model.User;



@RestController
public class UserController  {

	 @Autowired
     UserDao userDao;
	
	
	 @GetMapping("/insertUser/{name}/{password}/{usertype}/{mobilenumber}/{email}/{confirmed}")
	 public  User insertUser(@PathVariable("name") String userName,@PathVariable("password") String password,@PathVariable("usertype") String userType,@PathVariable("email") String email, @PathVariable("mobilenumber") long mobileNumber  ,@PathVariable("confirmed") Boolean confirmed ) 
     {
		 User user=new User(userName,password,userType,email,mobileNumber,confirmed);
		 return  userDao.save(user);
     }
}

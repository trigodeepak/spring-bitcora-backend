package com.bicora.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bicora.backend.entity.User;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserDaoService userDaoService;
	
	@Override
	public void run(String... arg0) throws Exception{
		User user = new User("Jack","Admin");
		long id = userDaoService.createUser(user);
		System.out.println("New user is created" + id );
	}
}

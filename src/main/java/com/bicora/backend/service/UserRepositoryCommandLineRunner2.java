package com.bicora.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bicora.backend.entity.User;

@Component
public class UserRepositoryCommandLineRunner2 implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... arg0) throws Exception{
		User user = new User("Jack","Admin");
		userRepository.save(user);
		
		userRepository.findById(1L);
		
		
		System.out.println("New user is created" );
	}
}

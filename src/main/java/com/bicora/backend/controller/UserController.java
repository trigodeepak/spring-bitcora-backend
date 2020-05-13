package com.bicora.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bicora.backend.entity.User;
import com.bicora.backend.service.UserDaoService;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	UserDaoService userDaoService;
	
	@GetMapping(path="/all")
	public List<User> getAll(){
		return userDaoService.getAllUsers();
	}
	
	@GetMapping(path="/id/{id}")
	public User findById(@PathVariable long id){
		return userDaoService.findById(id);
	}
	
	@PostMapping(path="/add")
	public long createUser(@RequestBody User user) {
		return userDaoService.createUser(user);
	}
	
	@PutMapping(path="/update")
	public User udpateUser(@RequestBody User user) {
		return userDaoService.updateById(user);
	}
	

}

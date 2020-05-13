package com.bicora.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	private String name, email;
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public User() {}
	

}

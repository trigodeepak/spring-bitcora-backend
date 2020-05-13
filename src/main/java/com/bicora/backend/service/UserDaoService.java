package com.bicora.backend.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.bicora.backend.entity.User;

@Repository
@Transactional
public class UserDaoService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long createUser(User user) {
		entityManager.persist(user);
		return user.getId();
	}
	
	public List<User> getAllUsers(){
		System.out.println("Came here");
//		return null;
		return entityManager.createQuery("select u from User u",User.class).getResultList();
	}
	
	public User findById(long id) {
		return entityManager.find(User.class, id);
	}
	
	public User updateById(User user) {
		User updateUser = entityManager.find(User.class, user.getId());
		updateUser = user;
		return updateUser;
	}

}

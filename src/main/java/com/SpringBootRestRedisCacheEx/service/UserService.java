package com.SpringBootRestRedisCacheEx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.SpringBootRestRedisCacheEx.entity.User;
import com.SpringBootRestRedisCacheEx.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public Integer saveUser(User user) {
		return userRepo.save(user).getId();
	}
	
	@Cacheable(value="users", key = "#userId")
	public User getOneUser(Integer userId) {
		return userRepo.findById(userId).get();
	}
	
	@CachePut(value="users", key = "#userId")
	public void updateUser(Integer userId, User user) {
		User userDb = userRepo.findById(userId).get();
		userDb.setName(user.getName());
		userDb.setRole(user.getRole());
		userRepo.save(userDb);
	}
	
	@CacheEvict(value="users", allEntries = true)
	public void deleteUser(Integer userId) {
		userRepo.deleteById(userId);
	}
	
}

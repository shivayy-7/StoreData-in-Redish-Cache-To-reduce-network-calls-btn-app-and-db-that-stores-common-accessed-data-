package com.SpringBootRestRedisCacheEx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootRestRedisCacheEx.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

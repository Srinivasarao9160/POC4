package com.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

}

package com.example.fancrab_backened.repository;


import java.util.List;

import com.example.fancrab_backened.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
	
	public List<User> findAllByOrderByCreatedAtDesc();



}

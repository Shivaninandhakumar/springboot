package com.example.cricket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cricket.model.user;

@Repository

public interface userRepository extends JpaRepository<user,Integer>{
	user findByUsername(String username);


}

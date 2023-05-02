package com.example.cricket.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cricket.model.cricket;
@Repository


public interface cricketRepository extends JpaRepository<cricket,Integer> 
{
	//List<cricket> findByNameStartingWith(String prefix);

	//
	
	
	
	
	
	
	
	
	
	
	
//List<cricket> findByNameEndingWith(String suffix);

	//List<cricket> findByCountry(String country);
	//cricket findByusername(String username);
	

}

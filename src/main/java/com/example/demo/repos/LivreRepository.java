package com.example.demo.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Livre;

@Transactional
public interface LivreRepository extends JpaRepository<Livre,Integer> {

	
	

}

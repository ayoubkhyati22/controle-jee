package com.example.demo.jpa;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.controller.LivreController;
import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepository;
import com.example.demo.service.LivreService;


@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.example.demo.entities"})
@EnableAutoConfiguration
@EnableJpaRepositories("com.example.demo.repos")
@ComponentScan({"com.example.demo.controller", "com.example.demo.service"})

public class ControleApplication  {
	
	@Autowired
	LivreRepository livreRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
		
				
		System.out.println("Controle jee : Ayoub KHYATI 4IIRG2C");
		
		
		
		
		
	}
	


}

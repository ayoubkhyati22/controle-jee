package com.example.demo.controller;

import java.util.*;

import org.hibernate.annotations.OrderBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Livre;
import com.example.demo.service.LivreService;

@RestController
public class LivreController {
	
	@Autowired
	private LivreService service;
	
	// Ajouter un livre
	@PostMapping("/addLivre")
	public void add(@RequestBody Livre livre) {
	    service.addLivre(livre);
	}
	
	// Afficher la liste de tous les livres
	@GetMapping("/emsi_api/livres")
	public List<Livre> findAllLivres(){
		return service.getLivres();
	}
	
	// Afficher un livre dontid est passe en parametre
	@GetMapping("/emsi_api/livre/{id}")
	public Livre findLivreById(@PathVariable int id) {
		return service.getLivreById(id);
	}
	
	// Modifier un livre dont un objet livre est passe en parametre
	@PutMapping("/update")
	public Livre updateLivre(@RequestBody Livre livre) {
		return service.updateLivre(livre);
	}
	
	// Supprimer un livre dont id est passe en parametre
	@DeleteMapping("/delete/{id}")
	public String deleteLivre(@PathVariable int id) {
		return service.deleteLivre(id);
	}

}

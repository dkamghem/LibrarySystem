package com.demo.Library_App.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Library_App.model.Library;



@RestController
public class RestControllerApp {
	@Autowired
	LibraryService libraryService;
	
	@PostMapping ("/create")
	public Library createData1(@RequestBody Library l) {
		System.out.println(l.getLibId()+","+l.getLibAuthor()+","+l.getLibTitle()+","+l.getLibCost());		
		return libraryService.save(l);
	}
	
	@PutMapping ("/update")
	public Library update(@RequestBody Library l) {
		Library l1 = libraryService.findById(l.getLibId()).orElse(null);
		l1.setLibAuthor(l.getLibAuthor());
		l1.setLibTitle(l.getLibTitle());
		l1.setLibCost(l.getLibCost());
		return libraryService.save(l1);
	}
	
	@GetMapping("/getAllLibrary")
	public List<Library> findAllLibrary() {
		return libraryService.findAll();
	}
	
	@GetMapping("/getLibrary/{id}")
	public Optional<Library> findById(@PathVariable Integer id) {
		return libraryService.findById(id);
	}
	
	@DeleteMapping("/remove/{id}")
		public void Delete(@PathVariable Integer id) {
			 libraryService.deleteById(id);
			 System.out.println("Deleted");
		}

}

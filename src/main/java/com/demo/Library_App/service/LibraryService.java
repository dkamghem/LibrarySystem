package com.demo.Library_App.service;

import java.util.List;
import java.util.Optional;

import com.demo.Library_App.model.Library;


public interface LibraryService {
	public Library save(Library c);
	
	public Library update(Library c);
	
	public Optional<Library> findById(Integer id);
	
	public List<Library> findAll();
	
	public void deleteById(Integer id);
}

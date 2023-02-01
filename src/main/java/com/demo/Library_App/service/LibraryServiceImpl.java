package com.demo.Library_App.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.Library_App.dao.LibraryRepository;
import com.demo.Library_App.model.Library;

@Service
public class LibraryServiceImpl implements LibraryService{

	@Autowired
	LibraryRepository libRepository;
	
	@Override
	public Library save(Library l) {
		return libRepository.save(l);
	}

	@Override
	public Library update(Library l) {
		Library l1 = libRepository.findById(l.getLibId()).orElse(null);
		l1.setLibAuthor(l.getLibAuthor());
		l1.setLibTitle(l.getLibTitle());
		l1.setLibCost(l.getLibCost());
		return libRepository.save(l1);
	}

	@Override
	public Optional<Library> findById(Integer id) {
		return libRepository.findById(id);
	}

	@Override
	public List<Library> findAll() {
		return libRepository.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		libRepository.deleteById(id);
		
	}

}

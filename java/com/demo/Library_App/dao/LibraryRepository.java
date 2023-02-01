package com.demo.Library_App.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Library_App.model.Library;

public interface LibraryRepository extends JpaRepository <Library, Integer> {

}

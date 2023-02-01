package com.demo.Library_App.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Library {
	@Id
	@GeneratedValue
	private Integer libId;
	private String libAuthor;
	private String libTitle;
	private Integer libCost;
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(Integer libId, String libAuthor, String libTitle, Integer libCost) {
		super();
		this.libId = libId;
		this.libAuthor = libAuthor;
		this.libTitle = libTitle;
		this.libCost = libCost;
	}
	public Integer getLibId() {
		return libId;
	}
	public void setLibId(Integer libId) {
		this.libId = libId;
	}
	public String getLibAuthor() {
		return libAuthor;
	}
	public void setLibAuthor(String libAuthor) {
		this.libAuthor = libAuthor;
	}
	public String getLibTitle() {
		return libTitle;
	}
	public void setLibTitle(String libTitle) {
		this.libTitle = libTitle;
	}
	public Integer getLibCost() {
		return libCost;
	}
	public void setLibCost(Integer libCost) {
		this.libCost = libCost;
	}
	@Override
	public String toString() {
		return "Library [libId=" + libId + ", libAuthor=" + libAuthor + ", libTitle=" + libTitle + ", libCost="
				+ libCost + "]";
	}
	
	
}

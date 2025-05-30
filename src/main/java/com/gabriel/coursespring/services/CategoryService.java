package com.gabriel.coursespring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.coursespring.entities.Category;
import com.gabriel.coursespring.repositories.CategoryRepository;

@Service
public class CategoryService{
	
	@Autowired
	private CategoryRepository repository;

	public List<Category> findAlList(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
		
	}
	
}

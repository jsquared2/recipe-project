package com.sap.fs.poc.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sap.fs.poc.recipeproject.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{

}

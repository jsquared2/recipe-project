package com.sap.fs.poc.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sap.fs.poc.recipeproject.model.Recipe;

public interface RecipeRepository extends CrudRepository <Recipe, Long>{}

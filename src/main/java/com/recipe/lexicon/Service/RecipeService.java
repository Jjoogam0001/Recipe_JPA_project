package com.recipe.lexicon.Service;

import com.recipe.lexicon.Data.RecipeDao;
import com.recipe.lexicon.Entity.Recipe;
import com.recipe.lexicon.Repository.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService implements RecipeDao {

    @Autowired
    private RecipeRepo repository;

    @Override
    public List<Recipe> findAll() {
        return (List<Recipe>) repository.findAll();
    }

    @Override
    public Optional<Recipe> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Recipe Create(Recipe recipe) {
        return repository.save(recipe);
    }

    @Override
    public void deleteById(String id) {

    }
}

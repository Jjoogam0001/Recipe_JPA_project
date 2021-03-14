package com.recipe.lexicon.Data;

import com.recipe.lexicon.Entity.Recipe;

import java.util.List;
import java.util.Optional;

public interface RecipeDao {

    List<Recipe> findAll();
    Optional<Recipe> findById(String  id);
    Recipe Create(Recipe recipe);
    void deleteById(String id);
}

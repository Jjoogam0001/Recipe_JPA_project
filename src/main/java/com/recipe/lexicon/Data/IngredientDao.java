package com.recipe.lexicon.Data;

import com.recipe.lexicon.Entity.Ingredient;

import java.util.List;
import java.util.Optional;

public interface IngredientDao {

    List<Ingredient> findAll();
    Optional<Ingredient> findById(String  id);
    Ingredient Create(Ingredient ingredient);
    void deleteById(String id);



}

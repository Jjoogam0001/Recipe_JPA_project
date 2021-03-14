package com.recipe.lexicon.Data;

import com.recipe.lexicon.Entity.Recipe_Ingredient;

import java.util.List;

public interface Recipe_IngredientDao {

    List<Recipe_Ingredient> findAll();
    Recipe_Ingredient findById(String  id);
    Recipe_Ingredient Create(Recipe_Ingredient recipe_ingredient);
    void deleteById(String id);


}

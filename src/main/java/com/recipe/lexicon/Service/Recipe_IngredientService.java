package com.recipe.lexicon.Service;

import com.recipe.lexicon.Data.Recipe_IngredientDao;
import com.recipe.lexicon.Entity.Recipe_Ingredient;
import com.recipe.lexicon.Repository.Recipe_ingredientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Recipe_IngredientService implements Recipe_IngredientDao {



    @Autowired
    private Recipe_ingredientRepo repository;


    @Override
    public List<Recipe_Ingredient> findAll() {
        return repository.findAll();
    }

    @Override
    public Recipe_Ingredient findById(String id) {
        return repository.getOne(id);
    }

    @Override
    public Recipe_Ingredient Create(Recipe_Ingredient recipe_ingredient) {
        return repository.save(recipe_ingredient);
    }

    @Override
    public void deleteById(String id) {

    }
}

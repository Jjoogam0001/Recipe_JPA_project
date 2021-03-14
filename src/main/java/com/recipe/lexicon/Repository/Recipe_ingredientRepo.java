package com.recipe.lexicon.Repository;

import com.recipe.lexicon.Data.Recipe_IngredientDao;
import com.recipe.lexicon.Entity.Recipe_Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Optional;

public interface Recipe_ingredientRepo extends JpaRepository<Recipe_Ingredient,String> {


}

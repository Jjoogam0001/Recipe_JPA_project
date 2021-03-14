package com.recipe.lexicon.Repository;

import com.recipe.lexicon.Data.IngredientDao;
import com.recipe.lexicon.Entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Optional;

public interface IngredientRepo extends CrudRepository<Ingredient,String> {
}

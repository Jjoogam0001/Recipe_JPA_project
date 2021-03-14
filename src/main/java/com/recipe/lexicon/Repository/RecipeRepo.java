package com.recipe.lexicon.Repository;

import com.recipe.lexicon.Data.RecipeDao;
import com.recipe.lexicon.Entity.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Optional;

public interface RecipeRepo extends CrudRepository<Recipe,String> {



}

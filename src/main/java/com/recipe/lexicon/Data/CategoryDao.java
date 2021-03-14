package com.recipe.lexicon.Data;

import com.recipe.lexicon.Entity.Category;

import java.util.List;
import java.util.Optional;


public interface CategoryDao {
    List<Category> findAll();
    Optional<Category> findById(String  id);
    Category Create(Category category);
    void deleteById(String id);


}

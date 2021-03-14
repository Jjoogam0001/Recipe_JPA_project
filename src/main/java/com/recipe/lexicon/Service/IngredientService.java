package com.recipe.lexicon.Service;

import com.recipe.lexicon.Data.IngredientDao;
import com.recipe.lexicon.Entity.Ingredient;
import com.recipe.lexicon.Repository.IngredientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService implements IngredientDao {

    @Autowired
    private IngredientRepo repository;

    @Override
    public List<Ingredient> findAll() {
        return (List<Ingredient>) repository.findAll();
    }

    @Override
    public Optional<Ingredient> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Ingredient Create(Ingredient ingredient) {
        return repository.save(ingredient);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }


}

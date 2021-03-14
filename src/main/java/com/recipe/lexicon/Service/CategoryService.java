package com.recipe.lexicon.Service;

import com.recipe.lexicon.Data.CategoryDao;
import com.recipe.lexicon.Entity.Category;
import com.recipe.lexicon.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements CategoryDao {

    @Autowired
    private CategoryRepo repository;

    @Override
    public List<Category> findAll() {
        return (List<Category>) repository.findAll();
    }

    @Override
    public Optional<Category> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Category Create(Category category) {
        return repository.save(category);
    }

    @Override
    public void deleteById(String id) {

    }


}

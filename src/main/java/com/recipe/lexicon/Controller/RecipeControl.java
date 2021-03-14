package com.recipe.lexicon.Controller;


import com.recipe.lexicon.Entity.Recipe;

import com.recipe.lexicon.Service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class RecipeControl {
    @Autowired
    private RecipeService service;


    @GetMapping("/recepts")
    public List<Recipe> findCategories() {
        return service.findAll();
    }

    @GetMapping("/FindReceptById/{id}")
    public Optional<Recipe> show(@PathVariable String id) {

        return service.findById(id);
    }

    @PostMapping("/AddRecipe")
    public Recipe postBody(@RequestBody Recipe recipe) {
        return service.Create(recipe);
    }

    @PutMapping("/EditRecept/{id}")
    public ResponseEntity<?> update(@RequestBody Recipe recipe, @PathVariable String id) {
        try {
            Optional<Recipe> existProduct = service.findById(id);
            System.out.println(existProduct);
            service.Create(recipe);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "Delete_Recept/{id}")
    void deleteEmployee(@PathVariable String id) {
        service.deleteById(id);
    }
}

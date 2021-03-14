package com.recipe.lexicon.Controller;


import com.recipe.lexicon.Entity.Recipe_Ingredient;

import com.recipe.lexicon.Service.Recipe_IngredientService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController

public class Recipe_ingredientControl {
    @Autowired
    private Recipe_IngredientService service;


    @GetMapping("/recipeIngredients")
    public List<Recipe_Ingredient> findCategories() {
        return service.findAll();
    }

    @GetMapping("/FindRec_Ing_ById/{id}")
    public Recipe_Ingredient show(@PathVariable String id) {

        return service.findById(id);
    }

    @PostMapping("/AddRep_ing")
    public Recipe_Ingredient postBody(@RequestBody Recipe_Ingredient recipe_ingredient) {
        return service.Create(recipe_ingredient);
    }

    @PutMapping("/EditRep_Ing/{id}")
    public ResponseEntity<?> update(@RequestBody Recipe_Ingredient recipe_ingredient, @PathVariable String id) {
        try {
            Recipe_Ingredient existProduct = service.findById(id);
            System.out.println(existProduct);
            service.Create(recipe_ingredient);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "Delete_Rec_Ing/{id}")
    void deleteEmployee(@PathVariable String id) {
        service.deleteById(id);
    }








}

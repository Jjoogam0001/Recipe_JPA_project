package com.recipe.lexicon.Controller;

import com.recipe.lexicon.Entity.Ingredient;
import com.recipe.lexicon.Service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


@RestController
public class IngredientControl {
    @Autowired
    private IngredientService service;






    @GetMapping("/ingredienser")
    @ModelAttribute
    public List<Ingredient> findCategories() {
       // model.addAttribute("ingredients", service.findAll());
        return service.findAll();
    }

    @GetMapping("/ingredienser/{id}")
    public Optional<Ingredient> show(@PathVariable String id) {

        return service.findById(id);
    }

    @PostMapping("/postingredienser")
    public Ingredient postBody(@RequestBody Ingredient ingredient) {
        return service.Create(ingredient);
    }

    @PutMapping("/ingredienser/{id}")
    public ResponseEntity<?> update(@RequestBody Ingredient ingredient, @PathVariable String id) {
        try {
            Optional<Ingredient> existProduct = service.findById(id);
            System.out.println(existProduct);
            service.Create(ingredient);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "ingredienser/{id}")
    void deleteEmployee(@PathVariable String id) {
        service.deleteById(id);
    }



}




package com.recipe.lexicon.Controller;

import com.recipe.lexicon.Entity.Ingredient;
import com.recipe.lexicon.Service.CategoryService;
import com.recipe.lexicon.Entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
public class CategoryControll {



    @Autowired
   private CategoryService service;


    @GetMapping("/categories")
    public List<Category> findCategories() {
        return service.findAll();
    }


    @GetMapping("/Findcategory/{id}")
    public Optional<Category> show(@PathVariable String id) {

        return service.findById(id);
    }
    @PostMapping("/AddCategory")
    public Category postBody(@RequestBody Category category) {
        return service.Create(category);
    }

    @PutMapping("/EditCategory/{id}")
    public ResponseEntity<?> update(@RequestBody Category category, @PathVariable String id) {
        try {
            Optional<Category> existProduct = service.findById(id);
            System.out.println(existProduct);
            service.Create(category);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "DeleteCategory/{id}")
    void deleteEmployee(@PathVariable String id) {
        service.deleteById(id);
    }



}

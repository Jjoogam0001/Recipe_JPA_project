package com.recipe.lexicon.Controller;

import com.recipe.lexicon.Entity.Instructions;
import com.recipe.lexicon.Service.InstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController

public class InstructionControl {

    @Autowired
    private InstructionService service;


    @GetMapping("/Instructions")
    public List<Instructions> findCategories() {
        return service.findAll();
    }
    @GetMapping("/FindInstructionById/{id}")
    public Optional<Instructions> show(@PathVariable String id) {

        return service.findById(id);
    }

    @PostMapping("/AddInstruction")
    public Instructions postBody(@RequestBody Instructions instruction) {
        return service.Create(instruction);
    }

    @PutMapping("/EditInstruction/{id}")
    public ResponseEntity<?> update(@RequestBody Instructions instruction, @PathVariable String id) {
        try {
            Optional<Instructions> existProduct = service.findById(id);
            System.out.println(existProduct);
            service.Create(instruction);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "DeleteInstructions/{id}")
    void deleteEmployee(@PathVariable String id) {
        service.deleteById(id);
    }
}

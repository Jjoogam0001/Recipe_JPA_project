package com.recipe.lexicon.Service;

import com.recipe.lexicon.Data.InstructionsDao;
import com.recipe.lexicon.Entity.Instructions;
import com.recipe.lexicon.Repository.InstructionsRepo;
import org.aspectj.apache.bcel.generic.Instruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructionService implements InstructionsDao {

    @Autowired
    private InstructionsRepo repository;


    @Override
    public List<Instructions> findAll() {
        return (List<Instructions>) repository.findAll();
    }

    @Override
    public Optional<Instructions> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Instructions Create(Instructions instruction) {
        return repository.save(instruction);
    }

    @Override
    public void deleteById(String id) {

    }
}

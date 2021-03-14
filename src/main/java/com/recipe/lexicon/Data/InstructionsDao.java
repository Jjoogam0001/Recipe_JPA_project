package com.recipe.lexicon.Data;

import com.recipe.lexicon.Entity.Instructions;
import org.aspectj.apache.bcel.generic.Instruction;

import java.util.List;
import java.util.Optional;

public interface InstructionsDao {

    List<Instructions> findAll();
    Optional<Instructions> findById(String  id);
    Instructions Create(Instructions instruction);
    void deleteById(String id);
}

package com.recipe.lexicon.Repository;

import com.recipe.lexicon.Data.InstructionsDao;
import com.recipe.lexicon.Entity.Instructions;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.Optional;

public interface InstructionsRepo extends CrudRepository<Instructions,String> {



}

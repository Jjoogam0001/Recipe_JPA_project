package com.recipe.lexicon.Repository;

import com.recipe.lexicon.Data.CategoryDao;
import com.recipe.lexicon.Entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepo extends CrudRepository<Category,String> {




}

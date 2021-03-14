package com.recipe.lexicon.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String ingredientId;
    private String ingredientName;


    public Ingredient() {
    }

    public Ingredient(String ingredientId, String ingredientName) {
        this.ingredientId = ingredientId;
        this.ingredientName = ingredientName;
    }

    public Ingredient(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientId='" + ingredientId + '\'' +
                ", ingredientName='" + ingredientName + '\'' +
                '}';
    }
}

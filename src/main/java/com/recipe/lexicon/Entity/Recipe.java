package com.recipe.lexicon.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="recipe")
public class Recipe {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String RecipeId;
    private String receptName;
    @ManyToMany(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "recipe_has_recipe_category",
            joinColumns = @JoinColumn(name = "Recipe_reciper_id"),
            inverseJoinColumns = @JoinColumn(name = "Recipe_Category_Recipe_Category_Id")
    )
    private List<Category> categories;

    @OneToMany(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY
    )
    private List<Recipe_Ingredient> recipeIngredients;

    @OneToOne(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY

    )
    @JoinColumn(name = "Recipe_instructions_Recipe_instructions_id")
    private Instructions instructions;

    public Recipe() {
    }

    public Recipe(String recipeId, String receptName, List<Category> categories, List<Recipe_Ingredient> recipeIngredients, Instructions instructions) {
        RecipeId = recipeId;
        this.receptName = receptName;
        this.categories = categories;
        this.recipeIngredients = recipeIngredients;
        this.instructions = instructions;
    }

    public String getRecipeId() {
        return RecipeId;
    }

    public void setRecipeId(String recipeId) {
        RecipeId = recipeId;
    }

    public String getReceptName() {
        return receptName;
    }

    public void setReceptName(String receptName) {
        this.receptName = receptName;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Recipe_Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(List<Recipe_Ingredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public Instructions getInstructions() {
        return instructions;
    }

    public void setInstructions(Instructions instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "RecipeId='" + RecipeId + '\'' +
                ", receptName='" + receptName + '\'' +
                ", categories=" + categories +
                ", recipeIngredients=" + recipeIngredients +
                ", instructions=" + instructions +
                '}';
    }
}

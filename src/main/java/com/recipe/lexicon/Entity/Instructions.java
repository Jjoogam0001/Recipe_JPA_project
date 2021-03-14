package com.recipe.lexicon.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="recipe_instructions")
public class Instructions {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String instructionId;
    private String instructions;

    public Instructions() {
    }

    public Instructions(String instructionId, String instructions) {
        this.instructionId = instructionId;
        this.instructions = instructions;
    }

    public String getInstructionId() {
        return instructionId;
    }

    public void setInstructionId(String instructionId) {
        this.instructionId = instructionId;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Instructions{" +
                "instructionId='" + instructionId + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}

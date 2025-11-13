package com.example.formulations.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Ingredient {

    @Id
    private int id;
    private String description;
    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;
    private double cost;

    private List<Composition> compositions;

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Ingredient(int id, String description, Unit unit,double cost) {
        this.id = id;
        this.description = description;
        this.unit = unit;
        this.cost=cost;
    }

    public int getId() {
        return id;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCost() {
        return this.cost;
    }

    public String getDescription() {return description;}

    public static Ingredient getIngredientByDescription(List<Ingredient> ingredients,String description) {

        return ingredients.stream()
                .filter(p -> p.description.equals(description))
                .findFirst()
                .orElse(null);
    }

}

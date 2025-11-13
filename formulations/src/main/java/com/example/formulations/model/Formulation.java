package com.example.formulations.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Formulation {

    @Id
    private int id;
    private String description;
    private double lastCost;
    private List<Ingredient> ingredients;

    public Formulation(int id, String description,double lastCost) {
        this.id = id;
        this.description = description;
        this.lastCost = lastCost;
        ingredients=new ArrayList<Ingredient>();
    }

    public int Get_Num_Ingredients() {
        return ingredients.size();
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {}

    public List<Ingredient>  GetIngredients(){
        return ingredients;
    }

    public void setLastCost(double lastCost) {
        this.lastCost = lastCost;
    }


    public static Formulation getFormulationByDescription(List<Formulation> formulations,String description) {

        return formulations.stream()
                .filter(p -> p.description.equals(description))
                .findFirst()
                .orElse(null);
    }

}

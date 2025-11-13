package com.example.formulations.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Solution {

    private int id;
    private double cost;
    @ManyToOne
    @JoinColumn(name = "formulation_id")
    private Formulation formulation;
    private List<SolutionIngredient> solutionIngredients;

    public Solution() {
        solutionIngredients=new ArrayList<SolutionIngredient>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {return this.id;}



    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setFormulation(Formulation formulation) {
        this.formulation = formulation;
    }

    public Formulation getFormulation() {
        return this.formulation;
    }

    public List<SolutionIngredient> getSolutionIngredients() {return this.solutionIngredients;}

    public double getCost() {
        return this.cost;
    }

    public static Solution getSolutionById(List<Solution> solutions,int Id) {

        return solutions.stream()
                .filter(p -> p.getId()==Id)
                .findFirst()
                .orElse(null);
    }



}

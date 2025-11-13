package com.example.formulations.model;

import jakarta.persistence.*;

@Entity
public class FormulationIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // ID artificial solo para JPA

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "formulation_id", nullable = false)
    private Formulation formulation;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    public FormulationIngredient(Formulation formulation, Ingredient ingredient) {
        this.formulation = formulation;
        this.ingredient = ingredient;

    }



}



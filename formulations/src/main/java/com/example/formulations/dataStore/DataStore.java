package org.example.dataStore;
import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private static List<Ingredient> ingredients;

    private static List<Component> components;

    private static List<Composition> compositions;

    private static List<Formulation> formulations;

    private static List<FormulationIngredient> formulationIngredients;

    private static List<Unit> units;

    private static List<Solution> solutions;

    private static List<Constraint> constraints;

    private static List<SolutionIngredient> solutionIngredients;

    private static List<SolutionComponent> solutionComponents;

    public DataStore() {
        ingredients = new ArrayList<Ingredient>();
        units=new ArrayList<Unit>();
        components=new ArrayList<Component>();
        compositions=new ArrayList<Composition>();
        constraints=new ArrayList<Constraint>();
        formulations=new ArrayList<Formulation>();
        formulationIngredients=new ArrayList<FormulationIngredient>();
        solutions=new ArrayList<Solution>();
        solutionIngredients=new ArrayList<SolutionIngredient>();
        solutionComponents=new ArrayList<SolutionComponent>();
    }

    public void Borrar_Solucions() {
        solutions.clear();
        solutionIngredients.clear();
        solutionComponents.clear();


    }
    public  List<Ingredient> getIngredients () {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public  List<Constraint> getConstraints () {
        return constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
    }

    public  List<Composition> getCompositions () {
        return compositions;
    }

    public void setCompositions(List<Composition> compositions) {
        this.compositions = compositions;
    }

    public  List<Solution> getSolutions () {
        return solutions;
    }

    public  List<SolutionIngredient> getSolutionsIngredients () {
        return solutionIngredients;
    }

    public  List<Component> getComponents () {
        return components;
    }

    public  List<Formulation> getFormulations () {
        return formulations;
    }

    public  List<FormulationIngredient> getFormulationsIngredients () {
        return formulationIngredients;
    }

    public  List<Unit> getUnits () {
        return units;
    }

}

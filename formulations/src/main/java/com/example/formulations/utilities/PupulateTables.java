package org.example.utilities;

import org.example.dataStore.DataStore;
import org.example.model.*;

import java.util.List;



public class PupulateTables {

    public static void PopulateUnit(DataStore myDataStore) {

        List<Unit> units=myDataStore.getUnits();

        units.add(new Unit(1, "g"));
        units.add(new Unit(2, "L"));

    }

    public static void PopulateIngredient(DataStore myDataStore) {

        List<Ingredient> ingredients=myDataStore.getIngredients();

        ingredients.add(new Ingredient(1, "Arros",Unit.getUnitByDescription(myDataStore.getUnits(),"g"),3));
        ingredients.add(new Ingredient(2, "Blat",Unit.getUnitByDescription(myDataStore.getUnits(),"g"),2));
        ingredients.add(new Ingredient(3, "Pollastre",Unit.getUnitByDescription(myDataStore.getUnits(),"g"),5));

    }

    public static void PopulateComponent(DataStore myDataStore) {

        List<Component> components=myDataStore.getComponents();

        components.add(new Component(1, "Grasses",Unit.getUnitByDescription(myDataStore.getUnits(),"g")));
        components.add(new Component(2, "Proteines",Unit.getUnitByDescription(myDataStore.getUnits(),"g")));
        components.add(new Component(3, "Fibra",Unit.getUnitByDescription(myDataStore.getUnits(),"g")));
        components.add(new Component(4, "Hidrats de carboni",Unit.getUnitByDescription(myDataStore.getUnits(),"g")));
        components.add(new Component(5, "Calories",null));
    }

    public static void PopulateComposition(DataStore myDataStore) {

        List<Composition> compositions=myDataStore.getCompositions();

        compositions.add(  new Composition( Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Arros"),Component.getComponentByDescription(myDataStore.getComponents(),"Grasses"),0.2)  );
        compositions.add(  new Composition( Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Arros"),Component.getComponentByDescription(myDataStore.getComponents(),"Proteines"),0.3)  );
        compositions.add(  new Composition( Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Arros"),Component.getComponentByDescription(myDataStore.getComponents(),"Fibra"),0.5)  );

        compositions.add(  new Composition( Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Blat"),Component.getComponentByDescription(myDataStore.getComponents(),"Grasses"),0.2)  );
        compositions.add(  new Composition( Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Blat"),Component.getComponentByDescription(myDataStore.getComponents(),"Proteines"),0.2)  );
        compositions.add(  new Composition( Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Blat"),Component.getComponentByDescription(myDataStore.getComponents(),"Fibra"),0.6)  );

        compositions.add(  new Composition( Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Pollastre"),Component.getComponentByDescription(myDataStore.getComponents(),"Grasses"),0.4)  );
        compositions.add(  new Composition( Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Pollastre"),Component.getComponentByDescription(myDataStore.getComponents(),"Proteines"),0.5)  );
        compositions.add(  new Composition( Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Pollastre"),Component.getComponentByDescription(myDataStore.getComponents(),"Fibra"),0.1)  );

    }

    public static void PopulateFormulation(DataStore myDataStore) {

        List<Formulation> formulations=myDataStore.getFormulations();

        formulations.add(new Formulation(1, "Primera Formulació de prova",4.7));
        formulations.add(new Formulation(2, "Segona Formulació de prova",2));
        formulations.add(new Formulation(3, "Tercera Formulació de prova",2));

    }



    public static void PopulateConstraints(DataStore myDataStore) {

        List<Constraint> constraints=myDataStore.getConstraints();


        constraints.add(  new Constraint( Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Primera Formulació de prova"),Component.getComponentByDescription(myDataStore.getComponents(),"Grasses"),0.3,0.5)  );
        constraints.add(  new Constraint( Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Primera Formulació de prova"),Component.getComponentByDescription(myDataStore.getComponents(),"Proteines"),0.4,0.6)  );
        constraints.add(  new Constraint( Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Primera Formulació de prova"),Component.getComponentByDescription(myDataStore.getComponents(),"Fibra"),0.05,0.15)  );



    }

    public static void PopulateFormulationIngredient(DataStore myDataStore) {

        List<FormulationIngredient> formulationIngredients=myDataStore.getFormulationsIngredients();

        formulationIngredients.add(  new FormulationIngredient( Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Primera Formulació de prova"),Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Arros"))  );
        Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Primera Formulació de prova").GetIngredients().add(Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Arros"));
        formulationIngredients.add(  new FormulationIngredient( Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Primera Formulació de prova"),Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Blat"))  );
        Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Primera Formulació de prova").GetIngredients().add(Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Blat"));
        formulationIngredients.add(  new FormulationIngredient( Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Primera Formulació de prova"),Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Pollastre"))  );
        Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Primera Formulació de prova").GetIngredients().add(Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Pollastre"));

        formulationIngredients.add(  new FormulationIngredient( Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Segona Formulació de prova"),Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Arros"))  );
        Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Segona Formulació de prova").GetIngredients().add(Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Arros"));
        formulationIngredients.add(  new FormulationIngredient( Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Segona Formulació de prova"),Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Blat"))  );
        Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Segona Formulació de prova").GetIngredients().add(Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Blat"));

        formulationIngredients.add(  new FormulationIngredient( Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Tercera Formulació de prova"),Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Arros"))  );
        Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Tercera Formulació de prova").GetIngredients().add(Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Arros"));
        formulationIngredients.add(  new FormulationIngredient( Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Tercera Formulació de prova"),Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Blat"))  );
        Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Tercera Formulació de prova").GetIngredients().add(Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Blat"));
        formulationIngredients.add(  new FormulationIngredient( Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Tercera Formulació de prova"),Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Pollastre"))  );
        Formulation.getFormulationByDescription(myDataStore.getFormulations(),"Tercera Formulació de prova").GetIngredients().add(Ingredient.getIngredientByDescription(myDataStore.getIngredients(),"Pollastre"));

    }


    public static void PopulateAll(DataStore myDataStore) {

        PopulateUnit(myDataStore);

        PopulateComponent(myDataStore);
        PopulateIngredient(myDataStore);
        PopulateComposition(myDataStore);
        PopulateFormulation( myDataStore);
        PopulateFormulationIngredient(myDataStore);


        PopulateConstraints(myDataStore);


    }


}




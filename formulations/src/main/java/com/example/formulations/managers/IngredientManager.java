package com.example.formulations.managers;

import java.util.List;
import java.util.Scanner;

import com.example.formulations.dataStore.DataStore;
import com.example.formulations.model.Ingredient;
import com.example.formulations.model.Unit;

public class IngredientManager {

    public static void printIngredientList(List<Ingredient> ingredients) {

        System.out.println("Ingredients from DB: ");
        System.out.println("-------------------------");

        // print each car on a separate line with index
        //int index = 1;
        for (Ingredient ingredient : ingredients) {
            System.out.println("\t" + ingredient.getId() + " : " + ingredient.getDescription() + "\t" + ingredient.getUnit().getDescription() + "\t" + ingredient.getCost());

        }

        System.out.println("\n");
    }

    public static void createIngredient(DataStore myDataStore) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Ingredient id: ");
        int ingredientId = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter Ingredient desc: ");
        String ingredientDescription = scanner.nextLine();

        System.out.println("Enter Unit desc: ");
        String unitDescription = scanner.nextLine();

        List<Unit> units = myDataStore.getUnits();
        Unit unit=Unit.getUnitByDescription(units,unitDescription);

        System.out.println("Enter Cost: ");
        double cost = Double.valueOf(scanner.nextLine());

        Ingredient ingredient = new Ingredient(ingredientId, ingredientDescription,unit, cost);
        myDataStore.getIngredients().add(ingredient);


    }


}

package org.example.managers;

import java.util.List;
import java.util.Scanner;

import org.example.dataStore.DataStore;
import org.example.model.Solution;
import org.example.model.SolutionIngredient;
import org.example.model.Unit;

public class SolutionManager {

    public static void printSolutionList(List<Solution> solutions) {

        System.out.println("Solutions from DB: ");
        System.out.println("-------------------------");

        // print each car on a separate line with index
        //int index = 1;
        for (Solution solution : solutions) {
            System.out.print("\t" + solution.getId() + " : " + solution.getFormulation().getDescription() + "\t"
                    );
            System.out.printf("Cost: %.2f%n",solution.getCost());

        }

        System.out.println("\n");
    }


    public static void printSolutionIngredientList(List<SolutionIngredient> solutionsIngredients) {

        System.out.println("Solution Ingredients from DB: ");
        System.out.println("-------------------------");

        // print each car on a separate line with index
        //int index = 1;
        for (SolutionIngredient solutionIngredient : solutionsIngredients) {
            System.out.print("\t" + solutionIngredient.getIngredient().getDescription() + " : "  + "\t"
            );
            System.out.printf("Quantity: %.2f%n",solutionIngredient.getQuantity());

        }

        System.out.println("\n");
    }



}

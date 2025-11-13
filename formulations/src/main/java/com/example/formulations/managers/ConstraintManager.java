package org.example.managers;

import java.util.List;
import java.util.Scanner;

import org.example.dataStore.DataStore;
import org.example.model.Constraint;
import org.example.model.Unit;

public class ConstraintManager {

    public static void printConstraintList(List<Constraint> constraints) {

        System.out.println("Constraints from DB: ");
        System.out.println("-------------------------");

        // print each car on a separate line with index
        //int index = 1;
        for (Constraint constraint : constraints) {
            System.out.println("\t" + constraint.getFormulation().getDescription() + " -> " + constraint.getComponent().getDescription() + "\t" + constraint.getCantMin() + " - "+constraint.getCantMax() );

        }

        System.out.println("\n");
    }




}

package com.example.formulations.managers;

import java.util.List;
import java.util.Scanner;

import com.example.formulations.dataStore.DataStore;
import com.example.formulations.model.Constraint;
import com.example.formulations.model.Unit;

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

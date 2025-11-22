package com.example.formulations.managers;

import java.util.List;
import java.util.Scanner;

import com.example.formulations.dataStore.DataStore;
import com.example.formulations.model.Unit;

public class UnitManager {

    public static void printUnitList(List<Unit> units) {

        System.out.println("Units from DB: ");
        System.out.println("-------------------------");

        // print each car on a separate line with index
        //int index = 1;
        for (Unit unit : units) {
            System.out.println("\t" + unit.getId() + " : " + unit.getDescription());

        }

        System.out.println("\n");
    }

    public static void createUnit(DataStore myDataStore) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Unit id: ");
        int unitId = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter Unit desc: ");
        String unitDescription = scanner.nextLine();

        Unit unit = new Unit(unitId, unitDescription);
        myDataStore.getUnits().add(unit);


    }


}

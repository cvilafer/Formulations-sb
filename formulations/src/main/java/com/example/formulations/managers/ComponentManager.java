package com.example.formulations.managers;

import java.util.List;
import java.util.Scanner;

import com.example.formulations.dataStore.DataStore;
import com.example.formulations.model.Component;
import com.example.formulations.model.Unit;

public class ComponentManager {

    public static void printComponentList(List<Component> components) {

        System.out.println("Components from DB: ");
        System.out.println("-------------------------");

        // print each car on a separate line with index
        //int index = 1;
        for (Component component : components) {
            System.out.println("\t" + component.getId() + " : " + component.getDescription() + "\t" +
                    (component.getUnit() != null ? component.getUnit().getDescription() : "") );

        }

        System.out.println("\n");
    }

    public static void createComponent(DataStore myDataStore) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Component id: ");
        int componentId = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter Component desc: ");
        String componentDescription = scanner.nextLine();

        System.out.println("Enter Unit desc: ");
        String unitDescription = scanner.nextLine();

        List<Unit> units = myDataStore.getUnits();
        Unit unit=Unit.getUnitByDescription(units,unitDescription);


        Component component = new Component(componentId, componentDescription,unit);
        myDataStore.getComponents().add(component);


    }


}

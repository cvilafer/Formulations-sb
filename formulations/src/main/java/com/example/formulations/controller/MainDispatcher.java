package org.example.controller;
import org.example.managers.*;
import org.example.model.Solution;
import org.example.views.MainMenuView;
import org.example.dataStore.DataStore;
import org.example.utilities.Utilities;

import java.util.Scanner;

public class MainDispatcher {

    public static void runner(DataStore myDataStore ) {

        Scanner scanner = new Scanner(System.in);

        while(true){

            MainMenuView.showMainMenu();
            String option = Utilities.ask(scanner, "Option? ");

            if (option.equals("0")) {
                break;
            } else if (option.equals("1")){  //Ingredients
                // option #1;
                //String resultado=ClientManager.loginClient(myDataStore);
                //System.out.println(resultado);
                IngredientManager.printIngredientList(myDataStore.getIngredients());
            } else if (option.equals("2")){  //Components
                // option #3;
                //String resultado= BookingManager.createBooking(myDataStore);
                //System.out.println(resultado);
                ComponentManager.printComponentList(myDataStore.getComponents());
            } else if (option.equals("3")){  //Units
                // option #3;
                //BookingManager.printBookingList(myDataStore.getBookings());
                UnitManager.printUnitList(myDataStore.getUnits());
            } else if (option.equals("4")){  //Solver
                // option #4;

                Solver solver=new Solver(myDataStore);

                solver.resoldre_formulacio(myDataStore.getFormulations().get(0));
            } else if (option.equals("5")){  //Solver
                // option #4;

                SolutionManager.printSolutionList(myDataStore.getSolutions());

                MainDispatcher.runnerSolution(myDataStore);
            }  else if (option.equals("6")){  //Solver
                // option #4;

                ConstraintManager.printConstraintList(myDataStore.getConstraints());

                MainDispatcher.runnerSolution(myDataStore);
            }else {
                System.out.println("Unknown word");
            }
        }

    }


    public static void runnerSolution(DataStore myDataStore ) {

        Scanner scanner = new Scanner(System.in);

        while(true){

            MainMenuView.showSolutionMenu();
            String option = Utilities.ask(scanner, "Option? ");

            if (option.equals("0")) {
                break;
            } else if (option.equals("1")){  //Ingredients
                // option #1;
                //String resultado=ClientManager.loginClient(myDataStore);
                //System.out.println(resultado);
                //IngredientManager.printUnitList(myDataStore.getIngredients());

                int solutionID = Integer.valueOf(Utilities.ask(scanner, "Solution Id? "));

                Solution solution = Solution.getSolutionById(myDataStore.getSolutions(),solutionID);

                SolutionManager.printSolutionIngredientList(solution.getSolutionIngredients());

            }
            else {
                System.out.println("Unknown word");
            }
        }

    }




}

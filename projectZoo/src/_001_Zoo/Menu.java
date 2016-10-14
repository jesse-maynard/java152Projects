package _001_Zoo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by jessemaynard on 10/14/16.
 */
public class Menu {

   //Scanner for menu
    Scanner input = new Scanner(System.in);

    public void menuOptions() {

        //Variable to hold menu input
        int menuInput, i;

        boolean isOnMenu = true;


        try {
            while (isOnMenu) {

                    System.out.println("Welcome to the Zoo-tron 4100");
                    System.out.println("What would you like to do?");
                    System.out.println("1. View Animals");
                    System.out.println("2. View People");
                    System.out.println("3. Create New Animal");
                    System.out.println("4. Create New Person");

                    menuInput = input.nextInt();

                    //Access methods in other classes
                    Animal accessAnimal = new Animal(null, null, null, null, 0);
                    Person accessPerson = new Person(null, null, 0);

                    switch (menuInput) {
                        case (1):
                            for(i = 0; i < Zoo.animalList.size(); ++i){
                            System.out.println(Zoo.animalList.get(i));}
                            break;
                        case (2):
                            System.out.println(Zoo.personList);
                            break;
                        case (3):
                            accessAnimal.createAnimal();
                            break;
                        case (4):
                            accessPerson.createPerson();
                            break;
                    }
            }
        }
            catch (InputMismatchException ime){
            System.out.println("That's not right!");
        }

    }
}

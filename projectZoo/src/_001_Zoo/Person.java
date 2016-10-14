package _001_Zoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jessemaynard on 10/13/16.
 */
public class Person extends Zoo {

    Scanner personInput = new Scanner(System.in);


    public Person(String n, String g, int a){
        super(n, g, a);
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setGender(String g){
        gender = g;
    }
    public String getGender(){
        return gender;
    }

    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }

    public String displayAnimalInfo(){
        return  "Name: " + name + "\n"+
                "Gender: " + gender + "\n"+
                "Age: " + age;

    }


    public void createPerson(){
        //Selection menu
        System.out.println();

        boolean isAddingPerson = true;

        //Selection menu variable
        char personMenuInput;

        while (isAddingPerson){
        //Input parameters for new person.
        System.out.println("What is the name of the person?");
        setName(personInput.nextLine());
        System.out.println("What is the gender of the person?");
        setGender(personInput.nextLine());
        System.out.println("What is the age of the person?");
        setAge(personInput.nextInt());

        Person pE = new Person(getName(), getGender(), getAge());
        animalList.add(pE.displayAnimalInfo());


        System.out.println("Would you like to add another animal? y/n");
        personMenuInput = personInput.next().charAt(0);

        switch (personMenuInput){
            case ('y'):
                break;
            case ('n'): isAddingPerson = false;
                break;
        }
    }
    }


}

package _001_Zoo;

import java.util.Scanner;

/**
 * Created by jessemaynard on 10/13/16.
 */
public class Animal extends Zoo {

    //Scanner to detect input
    Scanner animalInput = new Scanner(System.in);

    //Variables
    protected String species, diet;

    //Constructor
    public Animal(String s, String d, String n, String g, int a){
        super(n, g, a);
        species = s;
        diet = d;
    }

    //Get and set methods
    public void setSpecies(String s){
        species = s;
    }
    public String getSpecies(){
        return species;
    }

    public void setDiet(String d){
        diet = d;
    }

    public String getDiet(){
        return diet;
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
        return "Species: " + species + "\n" +
                "Diet: " + diet + "\n"+
                "Name: " + name + "\n"+
                "Gender: " + gender + "\n"+
                "Age: " + age;

    }

    //Method that adds new animals
    public void createAnimal(){
        //Variable
        char animalMenuInput;

        boolean isAddingAnimal = true;


        while (isAddingAnimal) {

            //Input parameters for new animal
            System.out.println("Alrighty, what is the species of the animal?");
            setSpecies(animalInput.next());
            System.out.println("What is the diet of the species?");
            animalInput.nextLine();
            setDiet(animalInput.nextLine());
            System.out.println("What is the name of the animal?");
            setName(animalInput.nextLine());
            System.out.println("What is the gender of the animal?");
            setGender(animalInput.nextLine());
            System.out.println("What is the age of the animal?");
            setAge(animalInput.nextInt());

            Animal aN = new Animal(getSpecies(), getDiet(), getName(), getGender(), getAge());
            animalList.add(aN.displayAnimalInfo());

            System.out.println("Would you like to add another animal? y/n");
            animalMenuInput = animalInput.next().charAt(0);

            switch (animalMenuInput){
                case ('y'):
                    break;
                case ('n'): isAddingAnimal = false;
                    break;
            }

        }

    }
}

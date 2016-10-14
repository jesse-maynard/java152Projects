package _001_Zoo;

/**
 * Created by jessemaynard on 10/14/16.
 */
public class Tiger extends Animal {


    public Tiger(String s, String d, String n, String g, int a) {
        super(s, d, n, g, a);
    }


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

    public void createTiger(){


        //Input parameters for new animal
        setSpecies("Tiger");
        setDiet("Carnivore");
        System.out.println("What is the name of the Tiger?");
        setName(animalInput.nextLine());
        System.out.println("What is the gender of the Tiger?");
        setGender(animalInput.nextLine());
        System.out.println("What is the age of the Tiger?");
        setAge(animalInput.nextInt());

        Tiger tI = new Tiger(getSpecies(), getDiet(), getName(), getGender(), getAge());
        animalList.add(tI.displayAnimalInfo());
    }
}

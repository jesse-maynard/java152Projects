package _001_Zoo;

import java.util.ArrayList;

/**
 * Created by jessemaynard on 10/14/16.
 */
public class Zoo {

    static ArrayList<String> personList = new ArrayList<>();
    static ArrayList<String> animalList = new ArrayList<>();

    //Variables
    String name, gender;
    int age;

    public Zoo(String n, String g, int a) {
        name = n;
        gender = g;
        age = a;

    }
}

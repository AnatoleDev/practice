package generics.bounds;


import generics.bounds.entries.Animal;
import generics.bounds.entries.Cat;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {

    public static void main( String[] args ) {

        Animal cat = new Cat();

        List<Cat> catList = new ArrayList<>();
        //List<Animal> animalList = catList; //ошибка
    }
}

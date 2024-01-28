package org.example;

import org.example.Controller.Controller;
import org.example.Controller.SecondController;
import org.example.Data.Animal;
import org.example.Data.Cat;
import org.example.Data.Dog;
import org.example.Data.Horse;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SecondController secondController = new SecondController();
//        List<Dog> listOfDogs = Dog.listOfDogs;
//        List<Animal> union = new ArrayList<>();
//        List<Animal> union1 = new ArrayList<>();
//        union.addAll(Dog.listOfDogs);
//        union.addAll(Cat.listOfCats);
//        System.out.println("union = " + union);
//        for (Animal animal : union) {
//            System.out.println(animal);
//        }
//        Collections.sort(union);
//        System.out.println("==========");
//        for (Animal animal : union) {
//            System.out.println(animal);
//        }
//        controller.start();
          secondController.start();
    }
}
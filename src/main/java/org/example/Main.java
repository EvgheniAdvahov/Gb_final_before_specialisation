package org.example;

import org.example.Controller.Controller;
import org.example.Data.Animal;
import org.example.Data.Cat;
import org.example.Data.Dog;
import org.example.Data.Horse;
import org.example.View.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Кузя", new ArrayList<>(Arrays.asList("Кушать", "Домой")));
        Cat cat1 = new Cat("Дымок", new ArrayList<>(Arrays.asList("Ко мне")));
        Dog dog = new Dog("Лиза", new ArrayList<>(Arrays.asList("Cидеть", "Голос")));
        Dog dog1 = new Dog("Граф", new ArrayList<>(Arrays.asList("Охранять", "Фасс")));
        dog.setDateOfBirth(1999, 12, 12);
        dog1.setDateOfBirth(2006, 11, 11);
        cat.setDateOfBirth(2010, 9, 1);
        cat1.setDateOfBirth(2005, 5, 1);
        Controller controller = new Controller();
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
        controller.start();

    }
}
package org.example.AnimalManager;

import org.example.Data.*;
import org.example.View.ViewDogs;

import java.util.List;
import java.util.Scanner;

public class AnimalManager {

    ViewDogs viewAllDogs = new ViewDogs();

    public static void addCommandToAnimal(int animalType, int animalId, Scanner scanner2, List<? extends Animal> animalList) {
        switch (animalType) {
            case 1:
                addCommandToDog(animalId, scanner2, (List<Dog>) animalList);
                break;
            case 2:
                addCommandToCat(animalId, scanner2, (List<Cat>) animalList);
                break;
            case 3:
                addCommandToHorse(animalId, scanner2, (List<Horse>) animalList);
                break;
            case 4:
                addCommandToDonkey(animalId, scanner2, (List<Donkey>) animalList);
                break;
            default:
                throw new IllegalArgumentException("Неверный тип животного");
        }
    }

    private void addCommandToDog(int animalId, Scanner scanner2, List<Dog> dogList) {
        // Логика добавления команды для собаки
//        ViewAllDogsList();
        viewAllDogs.ViewDogList(Dog.listOfDogs);
    }

    private static void addCommandToCat(int animalId, Scanner scanner2, List<Cat> catList) {
        // Логика добавления команды для кошки
    }

    private static void addCommandToHorse(int animalId, Scanner scanner2, List<Horse> horseList) {
        // Логика добавления команды для лошади
    }

    private static void addCommandToDonkey(int animalId, Scanner scanner2, List<Donkey> donkeyList) {
        // Логика добавления команды для осла
    }

}

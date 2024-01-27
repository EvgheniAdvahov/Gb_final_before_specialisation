package org.example.Controller;

import org.example.AnimalManager.AnimalManager;
import org.example.Data.*;

import java.util.List;
import java.util.Scanner;

public class SecondController {

    private static final int OPTION_EXIT = 5;
    private AnimalManager animalManager = new AnimalManager();

    // ... (ваш код)

    public void start() {
        try (
                Scanner scanner = new Scanner(System.in);
                Scanner scanner2 = new Scanner(System.in)) {
            int myInput;
            while (true) {
                System.out.println("1 - Завести новое животное\n" +
                        "2 - Просмотреть бд\n" +
                        "3 - Добавить команду\n" +
                        "4 - Кол-во жиовтных в бд\n" +
                        "5 - Выход");
                System.out.println("Выберите действие");
                myInput = scanner.nextInt();
                switch (myInput) {
                    case 1:
                        handleOption1(scanner, scanner2);
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case OPTION_EXIT:
                        return;
                    default:
                        System.out.println("Неверная опция. Попробуйте снова.");
                }
            }
        }
    }

    private void handleOption1(Scanner scanner, Scanner scanner2) {
        int animalType;
        while (true) {
            System.out.println("1 - Добавить в бд собаку\n" +
                    "2 - Добавить в бд кошку\n" +
                    "3 - Добавить в бд лошадь\n" +
                    "4 - Добавить в бд осла\n" +
                    "5 - Выход");
            System.out.println("Выберите действие");
            animalType = scanner.nextInt();
            if (animalType >= 1 && animalType <= 4) {
                addCommandToAnimal(animalType, scanner, scanner2);
                break;
            } else if (animalType == 5) {
                break;
            } else {
                System.out.println("Неверная опция. Попробуйте снова.");
            }
        }
    }

    private void addCommandToAnimal(int animalType, Scanner scanner, Scanner scanner2) {
        ViewAllAnimalsList(animalType); // Показать список всех животных выбранного типа
        System.out.println("Выберите id животного, которому добавим команду");
        int animalId = scanner.nextInt();
        if (isValidAnimalId(animalId, animalType)) {
            animalManager.addCommandToAnimal(animalType, animalId, scanner2, getAnimalList(animalType));
        } else {
            System.out.println("Неверный id. Попробуйте снова.");
        }
    }

    private void ViewAllAnimalsList(int animalType) {
        switch (animalType) {
            case 1:
                viewAllDogsList();
                break;
            case 2:
                viewAllCatsList();
                break;
            case 3:
                viewAllHorsesList();
                break;
            case 4:
                viewAllDonkeysList();
                break;
            default:
                throw new IllegalArgumentException("Неверный тип животного");
        }
    }

    private void viewAllDogsList() {
        // Логика вывода списка собак
    }

    private void viewAllCatsList() {
        // Логика вывода списка кошек
    }

    private void viewAllHorsesList() {
        // Логика вывода списка лошадей
    }

    private void viewAllDonkeysList() {
        // Логика вывода списка ослов
    }

    private boolean isValidAnimalId(int animalId, int animalType) {
        switch (animalType) {
            case 1:
                return isValidAnimalId(animalId, Dog.listOfDogs);
            case 2:
                return isValidAnimalId(animalId, Cat.listOfCats);
            case 3:
                return isValidAnimalId(animalId, Horse.listOfHorses);
            case 4:
                return isValidAnimalId(animalId, Donkey.listOfDonkeys);
            default:
                throw new IllegalArgumentException("Неверный тип животного");
        }
    }

    private boolean isValidAnimalId(int animalId, List<? extends Animal> animalList) {
        return animalId >= 0 && animalId < animalList.size();
    }

    private List<? extends Animal> getAnimalList(int animalType) {
        switch (animalType) {
            case 1:
                return Dog.listOfDogs;
            case 2:
                return Cat.listOfCats;
            case 3:
                return Horse.listOfHorses;
            case 4:
                return Donkey.listOfDonkeys;
            default:
                throw new IllegalArgumentException("Неверный тип животного");
        }
    }

    // ... (остальные методы)
}

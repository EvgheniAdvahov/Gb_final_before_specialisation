package org.example.Controller;

import org.example.AnimalManager.AnimalManager;
import org.example.Data.*;
import org.example.Services.*;
import org.example.View.ViewCats;
import org.example.View.ViewDogs;
import org.example.View.ViewDonkeys;
import org.example.View.ViewHorses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private AnimalManager animalManager = new AnimalManager();

    ViewDogs viewAllDogs = new ViewDogs();
    ViewCats viewAllCats = new ViewCats();
    ViewHorses viewAllHorses = new ViewHorses();
    ViewDonkeys viewAllDonkeys = new ViewDonkeys();
    Counter counter = new Counter(0);

    AddDonkey addDonkey = new AddDonkey();
    AddHorse addHorse = new AddHorse();
    AddDog addDog = new AddDog();
    AddCat addCat = new AddCat();

    public Controller() {
    }

    public void start() {
        String my_command;
        Integer my_input;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Завести новое животное\n" +
                    "2 - Просмотреть бд\n" +
                    "3 - Добавить команду\n" +
                    "4 - Кол-во жиовтных в бд\n" +
                    "5 - Выход");
            System.out.println("Выберите действие");
            my_input = scanner.nextInt();
            if (my_input.equals(1)) {
                System.out.println("Вы выбрали 1 опцию");

                while (true) {
                    System.out.println("1 - Добавить в бд собаку\n" +
                            "2 - Добавить в бд кошку\n" +
                            "3 - Добавить в бд лошадь\n" +
                            "4 - Добавить в бд осла\n" +
                            "5 - Выход");
                    System.out.println("Выберите действие");
                    my_input = scanner.nextInt();
                    if (my_input.equals(1)) {
                        addDog.addAnimal();
                        break;
                    } else if (my_input.equals(2)) {
                        addCat.addAnimal();
                        break;
                    } else if (my_input.equals(3)) {
                        addHorse.addAnimal();
                        break;
                    } else if (my_input.equals(4)) {
                        addDonkey.addAnimal();
                        break;
                    } else if (my_input.equals(5)) {
                        break;
                    } else {
                        break;
                    }
                }
            } else if (my_input.equals(2)) {
                while (true) {
                    System.out.println("1 - Просмотреть бд собак\n" +
                            "2 - Просмотреть бд кошек\n" +
                            "3 - Просмотреть бд лошадей\n" +
                            "4 - Просмотреть бд ослов\n" +
                            "5 - Выход");
                    System.out.println("Выберите действие");
                    my_input = scanner.nextInt();
                    if (my_input.equals(1)) {
                        ViewAllDogsList();
                        break;
                    } else if (my_input.equals(2)) {
                        ViewAllCatsList();
                        break;
                    } else if (my_input.equals(3)) {
                        ViewAllHorsesList();
                        break;
                    } else if (my_input.equals(4)) {
                        ViewAllDonkeysList();
                        break;
                    } else if (my_input.equals(5)) {
                        break;
                    } else {
                        break;
                    }
                }

            } else if (my_input.equals(3)) {
                System.out.println("Вы выбрали Добавить команду");
                while (true) {
                    System.out.println("1 - Выбрать собаку\n" +
                            "2 - Выбрать кошку\n" +
                            "3 - Выбрать лошадь\n" +
                            "4 - Выбрать осла\n" +
                            "5 - Выход");
                    System.out.println("Выберите действие");
                    my_input = scanner.nextInt();
                    if (my_input.equals(1)) {
                        ViewAllDogsList();
                        System.out.println("Выберите id собаки, которой добавим команду");
                        my_input = scanner.nextInt();
                        if ((my_input < 0) || (my_input > Dog.listOfDogs.size() - 1)) {
                            System.out.println("такого id нет");
                            break;
                        } else {
                            System.out.println("Введите команду");
                            my_command = scanner2.nextLine();
                            System.out.println(Dog.listOfDogs.get(my_input));
                            List<String> dogCommands = Dog.listOfDogs.get(my_input).getCommands();
                            dogCommands.add(my_command);
                            System.out.println(dogCommands);
                            Dog.listOfDogs.get(my_input).setCommands(dogCommands);
                            break;
                        }
                    } else if (my_input.equals(2)) {
                        ViewAllCatsList();
                        System.out.println("Выберите id кошки, которой добавим команду");
                        my_input = scanner.nextInt();
                        if ((my_input < 0) || (my_input > Cat.listOfCats.size() - 1)) {
                            System.out.println("такого id нет");
                            break;
                        } else {
                            System.out.println("Введите команду");
                            my_command = scanner2.nextLine();
                            System.out.println(Cat.listOfCats.get(my_input));
                            List<String> catCommands = Cat.listOfCats.get(my_input).getCommands();
                            catCommands.add(my_command);
                            System.out.println(catCommands);
                            Cat.listOfCats.get(my_input).setCommands(catCommands);
                            break;
                        }
                    } else if (my_input.equals(3)) {
                        ViewAllHorsesList();
                        System.out.println("Выберите id лошади, которой добавим команду");
                        my_input = scanner.nextInt();
                        if ((my_input < 0) || (my_input > Horse.listOfHorses.size() - 1)) {
                            System.out.println("такого id нет");
                            break;
                        } else {
                            System.out.println("Введите команду");
                            my_command = scanner2.nextLine();
                            System.out.println(Horse.listOfHorses.get(my_input));
                            List<String> horseCommands = Horse.listOfHorses.get(my_input).getCommands();
                            horseCommands.add(my_command);
                            System.out.println(horseCommands);
                            Horse.listOfHorses.get(my_input).setCommands(horseCommands);
                            break;
                        }
                    } else if (my_input.equals(4)) {
                        ViewAllDonkeysList();
                        System.out.println("Выберите id осла, которому добавим команду");
                        my_input = scanner.nextInt();
                        if ((my_input < 0) || (my_input > Donkey.listOfDonkeys.size() - 1)) {
                            System.out.println("такого id нет");
                            break;
                        } else {
                            System.out.println("Введите команду");
                            my_command = scanner2.nextLine();
                            System.out.println(Donkey.listOfDonkeys.get(my_input));
                            List<String> donkeyCommands = Donkey.listOfDonkeys.get(my_input).getCommands();
                            donkeyCommands.add(my_command);
                            System.out.println(donkeyCommands);
                            Donkey.listOfDonkeys.get(my_input).setCommands(donkeyCommands);
                            break;
                        }
                    } else if (my_input.equals(5)) {
                        break;
                    }
                }
            } else if (my_input.equals(4)) {
                System.out.println("option 5");
                System.out.println("Animal.getGlobalCounter() = " + Animal.getGlobalCounter());
                try {
                    System.out.println("counter.getGlobalCount() = " + counter.getGlobalCount());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            } else if (my_input.equals(5)) {
                break;
            }
        }
    }


    public void ViewAllDogsList() {
        viewAllDogs.ViewDogList(Dog.listOfDogs);
    }

    public void ViewAllCatsList() {
        viewAllCats.ViewCatList(Cat.listOfCats);
    }

    public void ViewAllHorsesList() {
        viewAllHorses.ViewHorseList(Horse.listOfHorses);
    }

    public void ViewAllDonkeysList() {
        viewAllDonkeys.ViewDokeyList(Donkey.listOfDonkeys);
    }


}

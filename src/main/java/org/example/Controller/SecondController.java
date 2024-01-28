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

public class SecondController {
    private AnimalManager animalManager = new AnimalManager();
    Counter counter = new Counter(0);

    public SecondController() {
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        Integer my_input;
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
                animalManager.addAnimal();


            } else if (my_input.equals(2)) {
                System.out.println("Вы выбрали 2 опцию");
                animalManager.ViewAnimal();


            } else if (my_input.equals(3)) {
                System.out.println("Вы выбрали 3 опцию");
                animalManager.addCommandToAnimal();

            } else if (my_input.equals(4)) {
                System.out.println("Вы выбрали 4 опцию");
                try {
                    System.out.println("counter.getGlobalCount() = " + counter.getGlobalCount());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            } else if (my_input.equals(5)) {
                System.out.println("Вы выбрали 5 опцию");
                break;
            }
        }
    }
}

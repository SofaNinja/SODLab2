package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue(30);

        loop:
        while (true) {
            menu();
            System.out.println("\nВведіть номер опції нижче:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    int numberToAdd = scanner.nextInt();
                    queue.addNumber(numberToAdd);
                }
                case 2 -> {
                    int numberRemoved = queue.deleteNumber();
                    if (numberRemoved == -1) {
                        System.out.println("Черга пуста");
                    } else {
                        System.out.println("Число було видалене з черги");
                    }
                }
                case 3 -> {
                    if (queue.isEmpty()) {
                        System.out.println("Черга пуста");
                    } else {
                        System.out.println("У черзі є числа");
                    }
                }
                case 4 -> {
                    if (queue.isFull()) {
                        System.out.println("Черга заповнена");
                    } else {
                        System.out.println("У черзі ще є місце");
                    }
                }
                case 5 -> queue.printQueue();
                case 6 -> { break loop; }
            }
        }
    }
    private static void menu() {
        System.out.println("1: Додати число до черги");
        System.out.println("2: Видалити число з черги");
        System.out.println("3: Перевірити чи пуста черга");
        System.out.println("4: Перевірити чи повна черга");
        System.out.println("5: Вивести числа у черзі");
        System.out.println("6: Вихід");
    }
}
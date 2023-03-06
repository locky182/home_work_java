package com.alexey.homeWorkFirst;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int number = new Random().nextInt(100) + 1; // здесь загадывается число от 1 до 99
        int maxAttempts = 10; // здесь задается количество попыток
        //int attemptsCount = 0;// для подсчета попытки, когда угадал
        System.out.println("Я загадал число. У тебя " + maxAttempts + " попыток угадать.");

        while (maxAttempts > 0) {
            int myNum = scanner.nextInt();

            if (number == myNum) {
                // attemptsCount++;
                //Подсчет попытки угадывания без внедрения новой переменной счетчика (11 - maxAttempts)
                System.out.println("Ты угадал с " + (11 - maxAttempts) + " попытки");
                break;

            }

            if (number < myNum) {
                // attemptsCount++;
                maxAttempts--;
                System.out.println("Мое число меньше! У тебя осталось " + maxAttempts + " попыток");

            }
            if (number > myNum) {
                //attemptsCount++;
                maxAttempts--;
                System.out.println("Мое число больше! У тебя осталось " + maxAttempts + " попыток");

            }

            if (maxAttempts == 0) {
                System.out.println("Ты не угадал");
                break;
            }
        }


    }
}

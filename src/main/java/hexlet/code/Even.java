package hexlet.code;

import java.util.Scanner;

public class Even {
    public static String greeting() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }
    public static String getNumber() {
        final int startOfRange = 1; //начало диапазона для рандомного числа;
        final int endOfRange = 100; //конец диапазона для рандомного числа;
        int c = startOfRange + (int) (Math.random() * ((endOfRange - startOfRange) + 1)); //рандомное число
        System.out.println("Question: " + c);
        String x; //переменная для записи верного ответа;
        if (c % 2 == 0) {
            x = "yes";
        } else {
            x = "no";
        }
        return x;
    }

    public static void compare() {
        String name = Even.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String number = Even.getNumber();
        Scanner sc = new Scanner(System.in);
        String choiceNumber = sc.next();
        if (choiceNumber.equals(number)) {
            System.out.println("Your answer: " + choiceNumber + "\nCorrect!");
            String number1 = Even.getNumber();
            Scanner sc1 = new Scanner(System.in);
            String choiceNumber1 = sc1.next();
            if (choiceNumber1.equals(number1)) {
                System.out.println("Your answer: " + choiceNumber1 + "\nCorrect!");
                String number2 = Even.getNumber();
                Scanner sc2 = new Scanner(System.in);
                String choiceNumber2 = sc2.next();
                if (choiceNumber2.equals(number2)) {
                    System.out.println("Your answer: " + choiceNumber2
                            + "\nCorrect!" + "\nCongratulations, " + name + "!");
                } else {
                    System.out.println("'" + choiceNumber2 + "'"
                            + " is wrong answer ;(. Correct answer was "
                            + "'" + number2 + "'" + ".\n"
                            + "Let's try again, " + name + "!");
                }
            } else {
                System.out.println("'" + choiceNumber1 + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + number1 + "'" + ".\n"
                        + "Let's try again, " + name + "!");
            }
        } else {
            System.out.println("'" + choiceNumber + "'"
                    + " is wrong answer ;(. Correct answer was "
                    + "'" + number + "'" + ".\n"
                    + "Let's try again, " + name + "");
        }
    }
}



package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
    }
}

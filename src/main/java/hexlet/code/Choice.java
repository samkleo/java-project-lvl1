package hexlet.code;
import java.util.Scanner;
public class Choice {
    public static void firstChoice() {
        Scanner sc = new Scanner(System.in);
        int choiceNumber = sc.nextInt();
        if (choiceNumber == 1) {
            System.out.println("Your choice: 1\n");
            System.out.println("Welcome to the Brain Games!\nMay I have your name?");
            Scanner sc1 = new Scanner(System.in);
            String name = sc1.next();
            System.out.println("Hello, " + name + "!");
        } else if (choiceNumber == 2) {
            System.out.println("Your choice: 2\n");
            Even.compare();
        }
    }
}

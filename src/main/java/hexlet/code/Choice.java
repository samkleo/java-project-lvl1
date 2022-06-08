package hexlet.code;
import java.util.Scanner;
public class Choice {
    public static void firstChoice() {
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int choiceNumber = sc.nextInt();
            if (choiceNumber == 1) {
                System.out.println("Welcome to the Brain Games!\nMay I have your name?");
                Scanner sc1 = new Scanner(System.in);
                String name = sc1.next();
                System.out.println("Hello, " + name + "!");
            } else if (choiceNumber == 2) {
                Even.compare();
            }
        } else {
            System.out.print("");
        }
    }
}

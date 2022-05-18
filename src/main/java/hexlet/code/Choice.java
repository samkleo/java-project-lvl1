package hexlet.code;
import java.util.Scanner;
public class Choice {
    public static void firstChoice() {
        Scanner sc = new Scanner(System.in);
        int choiceNumber = sc.nextInt();
        if (choiceNumber == 1) {
            System.out.println("Your choice: 1\n");
            Cli.greeting();
        }
    }
}

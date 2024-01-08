package Collections;
import EnglisgDictionary.EnglishDictionary;
import Menu.Menu;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        EnglishDictionary myDictionary = new EnglishDictionary();
        String userInput = "1";

        Scanner scanner = new Scanner(System.in);

        while (userInput.equals("1")) {
            Menu menu = new Menu(myDictionary);

            System.out.println("Do you want to continue?");
            System.out.println("1- Yes");
            System.out.println("2- No\n");
            userInput = scanner.nextLine();

            while (!userInput.equals("1") && !userInput.equals("2")) {
                System.out.println("Invalid input. Enter 1 or 2");
                System.out.println("Do you want to continue?");
                System.out.println("1- Yes");
                System.out.println("2- No");

                userInput = scanner.nextLine();
            }
        }

        // Close the scanner outside the loops
        scanner.close();
    }
}

package Menu;
import EnglisgDictionary.EnglishDictionary;
import java.util.Scanner;

public class Menu {
    public EnglishDictionary englishDictionary;
    public Menu(EnglishDictionary englishDictionary){
        this.englishDictionary = englishDictionary;
        displayMenu();
        validateUserInput();
    }
        public void displayMenu(){
            System.out.println("1- Insert into dictionary\n" +
                    "2- Display dictionary \n"+
                    "3- Search into dictionary\n"+
                    "4- Remove word from dictionary\n"+
                    "5- Get all words for specific charachter\n"+
                    "6- Remove all words according to specific key\n"+
                    "7- Make dictionary by your data\n");
        }

         public void validateUserInput(){
             Scanner scanner = new Scanner(System.in);
             System.out.println("Enter your choice: ");
             String userInput = scanner.nextLine();
             while(!userInput.equals("1") && !userInput.equals("2") && !userInput.equals("3") && !userInput.equals("4") && !userInput.equals("5") && !userInput.equals("6") && !userInput.equals("7")){
                 System.out.println("You must enter value from 1 to 7 !");
                 userInput = scanner.nextLine();
             }
             switch (userInput) {
                 case "1":
                     String isComplete = "1";
                     while(isComplete.equals("1")){
                         System.out.println("Enter a word");
                         userInput = scanner.nextLine();
                         englishDictionary.insertInDictionary(userInput);
                         do {
                             System.out.println("Do you want add new word\n" +
                                     "1- Yes\n" +
                                     "2- No\n");
                             isComplete = scanner.nextLine();
                         } while ((!isComplete.equals("1")&&!isComplete.equals("2")) );
                     }
                 break;
                 case "2":
                     englishDictionary.displayDictionary();
                     break;
                 case "3":
                     System.out.println("Enter you word");
                     userInput = scanner.nextLine();
                     englishDictionary.search(userInput);
                     break;
                 case "4":
                     System.out.println("Enter you word");
                     userInput = scanner.nextLine();
                     englishDictionary.removeWord(userInput);
                     break;
                 case "5":
                     System.out.println("Enter you char");
                     userInput = scanner.nextLine();
                     while(userInput.length() > 1 && !Character.isLetter(userInput.charAt(0))){
                         System.out.println("Invalid input, Enter alphaChrachter");
                         userInput = scanner.nextLine();
                     }
                     englishDictionary.removeAllKey(userInput.charAt(0));
                     break;
                 case "6":
                     System.out.println("Enter you char");
                     userInput = scanner.nextLine();
                     while(userInput.length() > 1 && !Character.isLetter(userInput.charAt(0))){
                         System.out.println("Invalid input, Enter alphaChrachter");
                         userInput = scanner.nextLine();
                     }
                     englishDictionary.getWords(userInput.charAt(0));
                     break;
                 case "7":
                     englishDictionary.fillUpYourDictionary();
                     break;
             }
             //scanner.close();
         }
    }

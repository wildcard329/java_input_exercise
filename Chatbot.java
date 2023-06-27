package section_5;

import java.util.Scanner;

public class Chatbot {
  public static void printNewLine(String str) {
    System.out.println(str);
  }

  public static int getIntegerInput(Scanner scanner) {
    return scanner.nextInt();
  }

  public static String geStringInput(Scanner scanner) {
    return scanner.nextLine();
  }

  public static void closeScanner(Scanner scanner) {
    scanner.close();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    printNewLine("Hello. What is your name?");
    String userName = geStringInput(scanner);
    printNewLine("Hi " + userName + "! I'm Javabot. Where are you from?");
    String userLocation = geStringInput(scanner);
    printNewLine("I hear it's beautiful at " + userLocation + "! I'm from a place called Oracle.");
    printNewLine("How old are you?");
    int userAge = getIntegerInput(scanner);
    int javaBotAge = 400;
    int multiplierAgeGap = javaBotAge / userAge;
    printNewLine("So you're " + userAge + ", cool! I'm " + javaBotAge + " years old.");
    printNewLine("This means I'm " + multiplierAgeGap + " times older than you.");
    printNewLine("Enough about me. What's your favorite language? (just don't say Python)");
    geStringInput(scanner);
    String userFavoriteLanguage = geStringInput(scanner);
    printNewLine(
        userFavoriteLanguage + ", fair enough! How many years have you been coding in " + userFavoriteLanguage + "?");
    int userFavoriteLanguageExperience = getIntegerInput(scanner);
    printNewLine(userFavoriteLanguageExperience + " years eh? That's great, keep it up!");
    printNewLine("Nice chatting with you " + userName + ". I have to log off now. See ya!");
    closeScanner(scanner);
  }
}

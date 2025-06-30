package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 5) + 1;
        int currentGuess = 0;
        boolean isGuessedcorrectly = false;
        System.out.println("I'm thinking of a number between 1 and 5.");

        Scanner scanner = new Scanner(System.in);

        for (int numberOfguesses = 1; numberOfguesses <=3; numberOfguesses++) {

            System.out.printf("Guess %d: ", numberOfguesses);
            currentGuess = scanner.nextInt();

            if(currentGuess == secretNumber) {
                System.out.println("You guessed it!");
                System.out.println("You Win!");
                isGuessedcorrectly = true;
                break;
            }
            else {
                System.out.println("Wrong Guess");
            }

        }

        if (!isGuessedcorrectly) {
            System.out.println("You lose. The correct number was " + secretNumber + ".");
        }

    }
}
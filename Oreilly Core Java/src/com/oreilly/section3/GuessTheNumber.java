package com.oreilly.section3;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int ourGuess;
        int computerNumber;
        int guessCount=0;
        boolean guessedNumber=false;
        Random random=new Random();
        computerNumber=random.nextInt(100)+1;
        Scanner keyboard=new Scanner(System.in);
        while(!guessedNumber) {
            System.out.println("enter your integer guess");
            ourGuess = keyboard.nextInt();
            guessCount++;
            if (ourGuess >= 1 && ourGuess <= 100) {
                if (ourGuess == computerNumber) {
                    System.out.println("congratulations! you guessed correct number " + guessCount + " is guess count");
                    guessedNumber = true;
                } else if (ourGuess > computerNumber) {
                    System.out.println("your guess is too high");
                } else {
                    System.out.println("your guess is too low");
                }
            } else {
                System.out.println("that was a wasted guess try between 1 and 100");
            }
        }
    }
}

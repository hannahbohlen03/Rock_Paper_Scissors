package com.LickingHeights;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        boolean Restart = true;
        boolean rounds = true;

        String a[] = new String[3];
        //a is the game's choice play in a numeral value
        a[0] = "rock";
        a[1] = "paper";
        a[2] = "scissors";

        int randomNumber = new Random().nextInt(a.length);

        String userMedium;
        String computerString;
        int userScore;
        int computerScore;
        int userChoiceNumber;

        //GAME START

        System.out.println(" _____________________________________");
        System.out.println("|                                     |");
        System.out.println("|                                     |");
        System.out.println("|                                     |");
        System.out.println("|      _______         ________       |");
        System.out.println("|                                     |");
        System.out.println("|                 <                   |");
        System.out.println("|                                     |");
        System.out.println("|                                     |");
        System.out.println("|                                     |");
        System.out.println("|         _________________           |");
        System.out.println("|                                     |");
        System.out.println("|                                     |");
        System.out.println("|                                     |");
        System.out.println("|_____________________________________|");

        System.out.println(" ");
        System.out.println("You are about to go up against a highly intelligent computer in a game of Rock, Paper, Scissors.");

       // while (Restart) {
            System.out.println("We will play best of three rounds.");
            System.out.println("Prepare yourself. Please choose a medium to play.");
            System.out.println(" ");

            //while (rounds) {
                userMedium = keyboard.nextLine();
                userChoiceNumber = userNumber(userMedium);
                System.out.println(" ");

                // System.out.println(userChoiceNumber); //DEBUG LINE

                System.out.println(" ");
                System.out.println("I choose " + a[randomNumber] + "!");
                System.out.println(" ");


           // }
      //  }
    }

    public static int userWins(int randomNumber, int userChoiceNumber, int userScore){
        if (randomNumber==2 && userChoiceNumber==0 ||
                randomNumber==0 && userChoiceNumber==1 ||
                    randomNumber==0 && userChoiceNumber==2){
            userScore+=1;
        }
        else {
            userScore +=0;
        }
        return userScore;
    }
    public static int computerWins(int randomNumber, int userChoiceNumber, int computerScore){
        if (randomNumber==0 && userChoiceNumber==2 ||
                randomNumber==1 && userChoiceNumber==0 ||
                randomNumber==2 && userChoiceNumber==1) {
            computerScore+=1;
        }
        else{
            computerScore+=0;
        }
        return computerScore;
    }


    public static int userNumber(String userMedium){
        int userChoiceNumber;
        if (userMedium.equalsIgnoreCase("rock")){
            userChoiceNumber= 0;
        }
        else if (userMedium.equalsIgnoreCase("paper")){
            userChoiceNumber=1;
        }
        else{
            userChoiceNumber=2;
        }
        return userChoiceNumber;
    }

}

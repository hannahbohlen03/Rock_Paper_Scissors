package com.LickingHeights;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        boolean Restart = true;
        boolean threeRounds = true;

        String a[]=new String[3];
        //a is the game's choice play in a numeral value
        a[0]= "Rock";
        a[1]= "Paper";
        a[2]= "Scissors";

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

        //while (Restart){
        System.out.println("Prepare yourself. Please choose a medium to play.");
        System.out.println("We will play best of three rounds.");
        System.out.println(" ");

       // while (threeRounds) {
            userMedium = keyboard.nextLine();
            userChoiceNumber=userNumber(userMedium);
            System.out.println(" ");

            System.out.println(userChoiceNumber); //DEBUG LINE
            System.out.println(randomNumber); //DEBUG LINE

            computerString = gameChoice(randomNumber);

            System.out.println(" ");

            System.out.println("I choose " + computerString + "!");

            System.out.println(" ");


        //}
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

    public static String gameChoice(int randomNumber){

        String computerString;
        if (randomNumber==0){
            computerString = "rock";
        }
        else if (randomNumber==1){
            computerString = "paper";
        }
        else {
            computerString = "scissors";
        }
        return computerString;
    }
}

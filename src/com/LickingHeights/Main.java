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

        String userMedium;
        int userChoiceNumber;

        //GAME START

        System.out.println(" _____________________________________");
        System.out.println("|                                     |");
        System.out.println("|                                     |");
        System.out.println("|                                     |");
        System.out.println("|      _______          ________      |");
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

        while (Restart) {
            int userScore = 0;
            int computerScore = 0;

            System.out.println("We will play best of three rounds.");
            System.out.println("Prepare yourself");
            System.out.println(" ");
            System.out.println("Please make your first move.");

            while (rounds) {
                Random r = new Random();
                int randomNumber = r.nextInt(a.length);
                userMedium = keyboard.nextLine();
                userChoiceNumber = userNumber(userMedium);

                if (userChoiceNumber == 3) {
                    System.out.println("Hmm, looks like you misspelled something. Try again.");
                } else {
                    System.out.println(" ");
                }
                // System.out.println(userChoiceNumber); //DEBUG LINE
                System.out.println("I choose " + a[randomNumber] + "!");

                //System.out.println(a[randomNumber]); //DEBUG LINE

                System.out.println(" ");

                userScore = userWins(randomNumber, userChoiceNumber, userScore); //DOES NOT WORK W/O THIS
                computerScore = computerWins(randomNumber, userChoiceNumber, computerScore); //DOES NOT WORK W/O THIS

                System.out.println("My score is now " + computerScore + "/3.");
                System.out.println("Your score is now " + userScore + "/3.");
                System.out.println(" ");

                if (userScore == 2 || computerScore == 2) {

                    if (userScore == 2) {
                        System.out.println("Looks like you won... Maybe I need to revise my calculations...");
                        System.out.println(" ");
                        System.out.println(" _____________________________________");
                        System.out.println("|                                     |");
                        System.out.println("|                                     |");
                        System.out.println("|                                     |");
                        System.out.println("|      _______          _______       |");
                        System.out.println("|                                     |");
                        System.out.println("|                 <                   |");
                        System.out.println("|                                     |");
                        System.out.println("|                                     |");
                        System.out.println("|                                     |");
                        System.out.println("|           _______________           |");
                        System.out.println("|          |               |          |");
                        System.out.println("|                                     |");
                        System.out.println("|                                     |");
                        System.out.println("|_____________________________________|");

                    } else if (computerScore == 2) { //If computer gets 2/3 wins
                        System.out.println("Looks like I won! I told you I was good at this!");
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
                        System.out.println("|         |_________________|         |");
                        System.out.println("|                                     |");
                        System.out.println("|                                     |");
                        System.out.println("|                                     |");
                        System.out.println("|_____________________________________|");
                    } else {
                        System.out.println("Hmm... looks like there was an error. Let's reset the game.");
                        break;
                    }
                    System.out.println(" ");
                    System.out.println("Let's play again soon!");
                    System.out.println("Here, I'll even reset the whole game for you!");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                }
                else{
                    System.out.println("Make your next move!");
                }
            }
        }
    }

    private static int userWins(int randomNumber, int userChoiceNumber, int userScore){

        //0 = rock
        //1 = paper
        //2 = scissors

        if (randomNumber==2 && userChoiceNumber==0 ||
                randomNumber==0 && userChoiceNumber==1 ||
                randomNumber==1 && userChoiceNumber==2){
            userScore ++;
        }
        else {
            userScore +=0;
        }
        return userScore;
    }
    private static int computerWins(int randomNumber, int userChoiceNumber, int computerScore){

        //0 = rock
        //1 = paper
        //2 = scissors

        if (randomNumber==0 && userChoiceNumber==2 ||
                randomNumber==1 && userChoiceNumber==0 ||
                randomNumber==2 && userChoiceNumber==1) {
            computerScore ++;
        }
        else{
            computerScore +=0;
        }
        return computerScore;
    }


    private static int userNumber(String userMedium){
        int userChoiceNumber;
        if (userMedium.equalsIgnoreCase("rock")){
            userChoiceNumber= 0;
        }
        else if (userMedium.equalsIgnoreCase("paper")){
            userChoiceNumber=1;
        }
        else if(userMedium.equalsIgnoreCase("scissors")){
            userChoiceNumber=2;
        }
        else{
            userChoiceNumber=3;
        }
        return userChoiceNumber;
    }
}

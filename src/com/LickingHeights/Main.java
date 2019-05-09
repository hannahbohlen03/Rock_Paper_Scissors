package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        boolean loop = true;
        int a[]=new int[2];
        //a is the game's choice play in a numeral value
        a[0]= 0; //Rock
        a[1]=1; //Paper
        a[2]=2; //Scissors

        String usermMdium;
        String computerString;




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

        while (loop){
            System.out.println("Prepare yourself. Please choose a medium to play.");
            System.out.println("We will play best of three.");
            System.out.println(" ");
            usermMdium = keyboard.nextLine();
            System.out.println(" ");




        }



    }
}

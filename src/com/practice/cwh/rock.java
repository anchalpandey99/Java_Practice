package com.practice.cwh;

import java.util.Random;
import java.util.Scanner;

public class rock {
    public static void main(String[] args) {
        //0 = rock
        //1 = paper
        //2 = scissor
        System.out.println("0 is for Rock, 1 is for Paper , 2 is for Scissor");
        System.out.print("Enter :");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        Random rm = new Random();
        int comp = rm.nextInt(3);

        if (comp == 0) {
            System.out.println("computer chose = rock");
        } else if (comp == 1) {
            System.out.println("computer chose = paper");
        } else if (comp == 2) {
            System.out.println("computer chose = Scissor");
        }


        if (user == comp) {
            System.out.println("draw game");
        } else if (user == 0 && comp == 2 || user == 1 && comp == 0 || user == 2 && comp == 1) {
            System.out.println("You won the game");
        } else {
            System.out.println("You lose the game");
        }


    }
}

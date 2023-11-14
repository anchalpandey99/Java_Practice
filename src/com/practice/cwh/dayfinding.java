package com.practice.cwh;

import java.util.Scanner;
public class dayfinding{
    public static void main(String []args){
        System.out.println("FINDING DAYS FROM NUMBER");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int day = sc.nextInt();
        switch (day) {

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}

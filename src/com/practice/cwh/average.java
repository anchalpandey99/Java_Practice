package com.practice.cwh;

import java.sql.SQLOutput;
import java.util.Scanner;
public class average {
    public static void main(String []args) {
        System.out.println("calculating com.practice.cwh.average");
        Scanner s = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = s.nextInt();
        System.out.print("enter com.practice.cwh.second number :");
        int b = s.nextInt();
        System.out.print("enter third number :");
        int c = s.nextInt();
        System.out.print("enter fourth number :");
        int d = s.nextInt();
        int average = a + b + c + d / 4;
        System.out.println("Average :" + average);
    }
}


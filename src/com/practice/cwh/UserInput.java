package com.practice.cwh;

import java.util.Scanner;

public class UserInput{

    public static void main(String[] args) {
        System.out.println("taking user input");

        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}


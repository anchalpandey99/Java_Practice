package com.practice.cwh;

import java.util.Scanner;
public class comparison {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number =");
        int num = sc.nextInt();
        int num1 = 8;
        if(num1>num)
        {
            System.out.println("The number is greater");
        }
        else
        {
            System.out.println("The given number is not greater");
        }
    }
}

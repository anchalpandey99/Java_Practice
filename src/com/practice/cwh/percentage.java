package com.practice.cwh;

import java.util.Scanner;
public class percentage
{
    public static void main(String[] args)
    {
        System.out.println("Finding com.practice.cwh.percentage of students");
        Scanner s =new Scanner(System.in);
        System.out.print("Marks in subject 1 :");
        float sub_1 = s.nextFloat();
        System.out.print("Marks in subject 2 :");
        float sub_2 = s.nextFloat();
        System.out.print("Marks in subject 3 :");
        float sub_3 = s.nextFloat();
        System.out.print("Marks in subject 4 :");
        float sub_4 = s.nextFloat();
        System.out.print("Marks in subject 5 :");
        float sub_5 = s.nextFloat();
        float total;
        float percentage;
        total = sub_1 + sub_2 + sub_3 + sub_4 +sub_5;
        percentage = total/500*100;

        System.out.println("Total is" + total);
        System.out.println("Percentage is:" + percentage);

        if(percentage >=90)
          {
              System.out.println("A Grade");
          }
        else if (percentage >=80)
        {
            System.out.println("B Grade");
        }
        else if (percentage >=70)
        {
            System.out.println("C Grade");
        }
        else if (percentage >=60)
        {
            System.out.println("D Grade");
        }
        else if(percentage >=50)
        {
            System.out.println("E Grade");
        }
        else
        {
            System.out.println("FAIL");
        }

    }
}

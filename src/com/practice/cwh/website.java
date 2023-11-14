package com.practice.cwh;

import java.util.Scanner;
public class website {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        String website =sc.next();
        if(website.endsWith(".com")){
            System.out.println("this is a commercial com.practice.cwh.website");
        }
        else if (website.endsWith(".org")){
            System.out.println("This is an organizational com.practice.cwh.website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This is an Indian com.practice.cwh.website");
        }
    }
}

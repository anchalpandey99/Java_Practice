package com.practice.cwh;

public class practice_set7 {
    // problem 1
   /* static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d*%d=%d\n",n,i,n*i);
        }
    }*/
    // problem 2
   /* static void pattern1(int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
   /* static void pattern2(int n){
        for (int i =4;i>0;i--){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }


    }*/
    static int fib(int n){
        if (n==1){
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String [] args){
       // multiplication(15);
        //pattern1(4);
       // pattern2(5);
        int result = fib(5);
        System.out.println(result);
    }
}

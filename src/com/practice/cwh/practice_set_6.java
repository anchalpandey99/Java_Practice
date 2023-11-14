package com.practice.cwh;

public class practice_set_6 {
    public static void main(String[] args) {
        // practice 1
       /* float [] marks ={45.7f,67.8f,63.4f,99.2f,100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum+element;
        }
        System.out.println("the sum total is" +sum);*/
        //practice 3
       /* int []marks ={65,71,89,90,60};
        int sum =0;
        int com.practice.cwh.average = 0;
        for(int num:marks){
            sum = sum +num;
        }
        com.practice.cwh.average = sum/5;
        System.out.println("the com.practice.cwh.average is "+com.practice.cwh.average);*/

        // practice 4
      /*  int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                System.out.print(result[i][j] + " ");
            }
            System.out.println(""); // Prints a new line
        }*/
        // practice 5
        /*int [] marks ={24,56,65,54,70};
        for(int n = marks.length-1;n>=0;n--){
            System.out.println(marks[n]);
            }*/
       /* int [] arr ={1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] =temp;
        }
        for(int element:arr){
            System.out.println(element);
        }*/
      /*  int [] a ={1,3,4,5,7};
        int n = a.length;
        int x = Math.floorDiv(n,2);
        System.out.println(x);*/


        // practice 6

       /* int [] arr = {1,24,32,2,9};
        int max =0;
        for(int ele:arr){
            if(ele>max){
                max = ele;
            }
        }
        System.out.println("the maximum value is "+ max);*/

        // practice 7

        /*int [] arr = {1,24,32,2,9};
        int min = 1;
        for(int ele:arr){
            if(ele < min){
                min = ele;
            }
        }
        System.out.println("the minimum value is "+ min);*/

        // practice 8

        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }


    }
}
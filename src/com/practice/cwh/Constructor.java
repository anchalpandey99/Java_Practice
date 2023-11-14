package com.practice.cwh;

public class Constructor {
    public void displaymessage(String name){
        System.out.println(name);
    }

    private void displaymessage(int age) {
        System.out.println(age);
    }

    public static void main(String [] args){
        Constructor exp = new Constructor();
        exp.displaymessage("My name is anchal pandey");
        exp.displaymessage(23);
    }
}



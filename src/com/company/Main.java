package com.company;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 || i%5 == 0) {
                if(i % 3 == 0) {
                    System.out.print("fizz");
                }
                if(i % 5 == 0) {
                    System.out.print("buzz");
                }
                System.out.println();
            }
            else{
                System.out.println(i);
            }
        }
    }
}

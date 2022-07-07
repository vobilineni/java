package com.company;

public class Main {

    public static void main(String[] args) {
        int min = 1;
        int max = 5;
        // write your code here
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i != min && i != max)&& (j!=min && j!=max))
                {
                    System.out.print(" "+" ");
                } else {
                    System.out.print("*"+" ");
                }
            }
            System.out.println("");
        }
    }
}

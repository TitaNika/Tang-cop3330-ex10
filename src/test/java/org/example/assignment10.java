/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment10 {

    public static void main( String[] args ) {

        float[] price = new float[3];
        float[] quantity = new float[3];
        float subtotal = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++){

            System.out.printf("Price of item %d: ", (i+1));
            price[i] = scan.nextInt();

            System.out.printf("Quantity of item %d: ", (i+1));
            quantity[i] = scan.nextInt();

        }

        for (int i = 0; i < 3; i++){
            subtotal += price[i] * quantity[i];
        }

        System.out.println("Subtotal: $" + String.format("%.2f",subtotal));

        System.out.println("Tax: $" + (subtotal * 0.055));

        System.out.println("Total: $" + (subtotal + (subtotal * 0.055)));

    }
}
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Double width, height, coverage,quantity, price, cost;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter wall width in metres");

        width = input.nextDouble();

        System.out.println("Please enter wall height in metres");

        height = input.nextDouble();

        System.out.println("Please enter coverage per tin can");

        coverage = input.nextDouble();

        System.out.println("Please enter the price per tin can");

        price = input.nextDouble();

        quantity = Math.ceil((width * height) / 10);   //assume a can of pant covers 10m^2
        cost = quantity * price;

        System.out.println("The quantity of Paint tines required will be " + quantity + ".");
        System.out.println("The price of the paint required will be £" + cost + ".");
    }
}

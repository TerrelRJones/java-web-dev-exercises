package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // pi
        double pi = 3.14;
        double r = 0;
        double area= 0;

        System.out.println("Enter a radius: ");

        if(input.hasNextDouble()) {
            r = input.nextDouble();
            input.close();
            area = Circle.getArea(r);
        } else {
            System.err.println("The bicycle has already stopped!");
        };
//        r = input.nextDouble();
//
//        while (!input.hasNextDouble()) {
//            System.out.println("Enter a valid radius: ");
//            r = input.nextDouble();
//        };
//
//        area = Circle.getArea(r);


        System.out.println("The area of a circle of radius " + r + " is: " + area);
        input.close();


    }


}

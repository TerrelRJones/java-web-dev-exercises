package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many mailes have you drive?");
        int milesDriven = input.nextInt();

        System.out.println("How many gallons of fuel have you used?");
        int gallonsOfFuelUsed = input.nextInt();
        input.close();

        int milesPerGallon =  milesDriven / gallonsOfFuelUsed;

        System.out.println("Your MPG is " + milesPerGallon);
    }
}

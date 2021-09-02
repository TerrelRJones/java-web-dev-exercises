package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter width of rectangle: ");
        int width = input.nextInt();

        System.out.println("Enter height of rectangle: ");
        int height = input.nextInt();
        input.close();

        int area = width * height;
        System.out.println("The area of your rectangle is " + area);
    }
}

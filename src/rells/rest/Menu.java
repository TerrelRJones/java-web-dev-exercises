package rells.rest;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        ArrayList menuItems = new ArrayList();

        menuItems.add(new MenuList("chicken", 23.00, "Smothered chicken", "Dinner"));
        menuItems.add(new MenuList("ribs", 34.00, "mad saucy ribs, big sauce", "Happy Hour"));

        Scanner input = new Scanner(System.in);
//    String quitChoice;
//        do{
////            addMenuItems();
//            System.out.println("Are you done adding menu items: y/n");
//            quitChoice = input.next();
//            System.out.println(quitChoice);
//
//        } while (quitChoice.toLowerCase() == "y");

//        public addMenuItems(ArrayList menuItems, Scanner input) {
            System.out.println("Name item: ");
            String itemName = input.nextLine();
            System.out.println("Enter item price: ");
            Double itemPrice = input.nextDouble();
            System.out.println("Enter description for item: ");
            String itemDescription = input.nextLine();
            System.out.println("Enter category for item: ");
            String itemCategory = input.nextLine();


            menuItems.add(new MenuList(itemName, itemPrice, itemDescription, itemCategory));
//        }

        System.out.println(menuItems.size());
    }
}

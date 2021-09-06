package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> numArr = new ArrayList<>();
        numArr.add(4);
        numArr.add(6);
        numArr.add(3);
        numArr.add(22);

        ArrayList<String> listStrings = new ArrayList<>();
        listStrings.add("micha");
        listStrings.add("albert");
        listStrings.add("terrel");
        listStrings.add("gloria");
        listStrings.add("kyrie");
        listStrings.add("Kesha");

        // call method in main method
        System.out.println( findSum(numArr));
        System.out.println(print(listStrings));

    }

    // methods
    public static int findSum(ArrayList<Integer> arr){
            int sum = 0;
            for(int number : arr){
                if(number % 2 == 0){
                    sum += number;
                }
            }
            return sum;
         }

    public static ArrayList<String> print(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> newArr = new ArrayList<>();

        System.out.println("Enter number for words with that length: ");
        int searchNum = input.nextInt();
        input.close();

        for(String a : arr){
            if(a.length() == searchNum){
                newArr.add(a);
            }
        }
        return newArr;
    }

}

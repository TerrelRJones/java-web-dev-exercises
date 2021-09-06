package exercises;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayPractice {
    public static void main(String[] args) {
//        int[] nums = {1,1,2,3,5,8};
        String sentence = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
//
//        for(int numbers : nums){
//            System.out.println(numbers);
//        }

        String[] words = sentence.split("\\.");
        System.out.println(Arrays.toString(words));

    }




}

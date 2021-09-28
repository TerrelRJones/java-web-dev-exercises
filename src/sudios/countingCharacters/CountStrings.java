package sudios.countingCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountStrings {
    public static void main(String[] args) {
        int count = 0;

        String passage = "If the product of two terms is zero then common sense says at least one " +
                    "of the two terms has to be zero to start with. So if you move all the terms over to " +
                    "one side, you can put the quadratics into a form that can be factored allowing that side " +
                    "of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

            char[] characterToString = passage.toCharArray();

        HashMap<Character, Integer> countLetters = new HashMap<>();

        for (int i = 0; i < characterToString.length; i++) {
                if(countLetters.containsKey(characterToString[i])) {
                    count = countLetters.get(characterToString[i]);
                    count++;
                    countLetters.put(characterToString[i], count);
                } else {

                    countLetters.put(characterToString[i], 1);
                }
        }

//        System.out.println("\n" + countLetters);
        for(Map.Entry<Character, Integer> letter : countLetters.entrySet()){
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }

}

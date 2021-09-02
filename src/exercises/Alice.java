package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String passage = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or conversation?";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word to search for in passage: ");
        String searchTerm = input.next();

        int indexOfWord = passage.toLowerCase().indexOf(searchTerm.toLowerCase());
        Boolean wordInPassage = passage.toLowerCase().contains(searchTerm.toLowerCase());
        int lengthOfWord = searchTerm.toLowerCase().length();


        System.out.println(wordInPassage);
        System.out.println("Index of String: " + indexOfWord);
        System.out.println("length of String: " + lengthOfWord);


    }
}

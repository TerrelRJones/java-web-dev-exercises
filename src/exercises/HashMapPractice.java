package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        students.put(7, "Albert");
        students.put(1, "Brooklyn");

        do {
            System.out.println("What is your name: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")){
                System.out.println("Enter an ID number: ");
                int id = input.nextInt();
//                input.close();

                students.put(id, newStudent);

            }
            // This far without book help
        } while (!newStudent.equals(""));

        input.close();
        System.out.println("\nClass Roster:");


        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + students.size());


//        System.out.println(students);
    }
}

package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student terrel = new Student("Terrel", 50, 1, 4.0);

//        terrel.setName("Terrel");
//        terrel.setGpa(4.0);

        System.out.println(terrel.getName() + " " + terrel.getNumberOfCredits() + " " +terrel.getGpa());
    }
}

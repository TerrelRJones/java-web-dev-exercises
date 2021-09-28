package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public  Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

//    public String getGradeLevel(){
//        if (this.numberOfCredits >= 90){
//            return "Senior";
//        } else if ( this.numberOfCredits < 90 && this.numberOfCredits >= 60 ){
//            return "Junior";
//        } else if (this.numberOfCredits <= 59 && this.numberOfCredits >= 30){
//            return  "Sophmore";
//        } else if (this.numberOfCredits >= 29 && this.numberOfCredits >= 0){
//            return "Freshman";
//        }
//    }

//    public void addGrade(int courseCredits, double grade) {
//        // Update the appropriate fields: numberOfCredits, gpa
//        this.gpa =
//    }


}
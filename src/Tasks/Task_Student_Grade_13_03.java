package Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_Student_Grade_13_03 {
    public static void main(String[] args) {

        // Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        Scanner scanner = new Scanner(System.in); //System.in represents the standard input from the keyboard

        System.out.println("Enter you marks: ");
        int marks = scanner.nextInt(); // nextInt() is a method of the Scanner class that is used to read an integer input from the user.
        scanner.close();

        String result = (marks >= 90)  ? "A" :
                        (marks >= 80) ? "B" :
                        (marks >= 70) ? "C" :
                        (marks >= 60)  ? "D" : "F";
        System.out.println("Grade:" + result);

}


}


package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab068_Real_Age_Classification {

    public static void main(String[] args) {

        // age = 23 -> Adult (age > 18), Minor (age <18), Senior (age > 65)
        //take the input from user

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Whats your age:");
        int age = scanner.nextInt();
        scanner.close();

        String result = (age > 65) ? "Senior" : (age > 18) ? "Adult" : "Minor";
        System.out.println(result);


    }
}

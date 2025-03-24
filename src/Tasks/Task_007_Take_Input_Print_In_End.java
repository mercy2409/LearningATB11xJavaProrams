package Tasks;

import java.util.Scanner;

public class Task_007_Take_Input_Print_In_End {

    //Take a user input - Name, Age and Salary and print them in the end.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your Age:");
        int age = scanner.nextInt();

        System.out.println("Enter your Salary:");
        int salary = scanner.nextInt();

        // Printing it
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        scanner.close();

    }
}

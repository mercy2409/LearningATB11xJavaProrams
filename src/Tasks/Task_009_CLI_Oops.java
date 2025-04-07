package Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_009_CLI_Oops {
    public static void main(String[] args) {

        //CLI option
        // Take the user input - Name, Age and Salary and print them in the end
        // Take a user input 2 numbers from the arguments and calculate the maximum in

//        System.out.println("Enter your name, age and Salary");
//        String name = args[0];
//        int age = Integer.parseInt(args[1]);
//        double salary = Double.parseDouble(args[2]);
//
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(salary);

        //NOTES: Above and below both are correct

        // Same can be done in Scanner class

        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter the information

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Enter you salary:");
        double salary = scanner.nextDouble();

        // Print the collection of information

        System.out.println("\n ... User Information...");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);

    scanner.close();

    }
}

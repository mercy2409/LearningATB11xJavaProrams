package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else {


        // Allowed to vote or not
        // if age is > 18 allowed to vote
        // else < > 18 -> Not allowed to vote

        //CLI option - A CLI option (Command Line Interface option) refers to an argument or flag that
        // you pass to a program when executing it in a command-line environment (like Command Prompt,
        // Terminal, or Bash). These options modify how the program runs.
        public static void main(String[] args) {
            // how to take user input
            //CLI option - A CLI option (Command Line Interface option) refers to an argument or flag that
            // you pass to a program when executing it in a command-line environment (like Command Prompt,
            // Terminal, or Bash). These options modify how the program runs.

            // 1. CLI option
        //int age = Integer.parseInt(args[0]);
            // 2. Scanner class
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age: " );
            int age = scanner.nextInt();

            if (age > 18) {
                System.out.println("Eligible for vote");
            }
            else {
                System.out.println("Not eligibile for vote");
            }





        System.out.println();
    }
}

package Tasks;

import java.util.Scanner;

public class Task_008_Take_Input_2no_Calcul_Max {
    public static void main(String[] args) {
        // Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 1st no: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter your 2nd no: ");
        int number2 = scanner.nextInt();

        int max = (number1 > number2) ? number1 : number2;

        System.out.println("Maximun no. is = " + max);



}

    }

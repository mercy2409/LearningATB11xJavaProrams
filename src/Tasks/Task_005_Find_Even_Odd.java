package Tasks;

import java.util.Scanner;

public class Task_005_Find_Even_Odd {

    // Create a Program - Take user input & Check weather the input is even or odd number
    public static void main(String[] args) {

        //int num = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number: ");
        int num = scanner.nextInt();


        System.out.println((num %2 == 0) ? "Even" : "Odd");
        scanner.close();
    }
}

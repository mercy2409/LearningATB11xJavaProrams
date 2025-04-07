package ex_09_Switch;

import java.util.Scanner;

public class Lab085_Switch_WithBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // System is class and in is input stream
        System.out.println("Enter the day number (1 to 7):");
        int day = scanner.nextInt();
        switch (day){

            case 1:
                System.out.println("Monday");
            break;

            case 2:
                System.out.println("Tuesday");
            break;

            case 3:
                System.out.println("Wednesday");
            break;

            case 4:
                System.out.println("Thursday");
            break;

            case 5:
                System.out.println("Friday");
            break;

            case 6:
                System.out.println("Saturday");
            break;

            case 7:
                System.out.println("Sunday");

        }


        System.out.println();
    }
}
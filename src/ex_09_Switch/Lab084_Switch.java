package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {

        //Switch
        //Take the user input and tell them the day which they have told
        // 1 to 7 -> 1 -> Monday, 5 -> Friday
        // 8 ? - Not allowed or error

        //int day = Integer.parseInt(args[0]); CLI option

        Scanner scanner = new Scanner(System.in); // System is class and in is input stream
        System.out.println("Enter the day number (1 to 7):");
        int day = scanner.nextInt();
        switch (day){

            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");

        }


        System.out.println();
    }
}

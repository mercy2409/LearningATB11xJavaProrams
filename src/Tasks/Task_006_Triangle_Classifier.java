package Tasks;

import java.util.Scanner;

public class Task_006_Triangle_Classifier {

    /*Write a program that classifies a triangle based on its side lengths. Given three input values
    representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
    isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement
    to classify the triangle.*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the 3 sides of the triangle

        System.out.println("Enter the first side 1: ");
        int side1 = scanner.nextInt();

        System.out.println("Enter the second side 2: ");
        int side2 = scanner.nextInt();

        System.out.println("Enter the third side 3: ");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3 && side1 == side3) ;
        System.out.println("Eqilateral triangle");
    } else if {
        System.out.println("Not a triangle");
                scanner.close();
        }

    }
}



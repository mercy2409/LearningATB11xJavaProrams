package ex_04_Operators;

public class Lab049_All_Operators {
    public static void main(String[] args) {

       boolean b1 = true;
        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        //Arithmetics Operators
        // +, -, *, /, %

        //Compound Assignment operators
        // +=, -=, /=, *=
        int age = 10;
        age += 10; // age = age + 10
        System.out.println(age);
        age -= 10; // how it is giving 10 it should be 0 know .......
        System.out.println(age);
        age *= 10;
        System.out.println(age);
        age /= 10;
        System.out.println(age); // how it is giving 10 it should be quotient or remainder know .......

        // Relational operators
        // > , < , >= , <= , ! , != , == (compare two values)

        //Logical operators
        //OR or AND , || , && , !

        // Optional to learn  - Digital electronics
        // Bitwise - Not important for Automation

        // - - Bitwise Not,
        // >> Right shift,
        // << Left shift,
        // - XOR ( // v towards down)

    }
}

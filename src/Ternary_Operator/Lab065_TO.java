package Ternary_Operator;

public class Lab065_TO {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        System.out.println(Math.max(x, y));

        String max = x>y ? "x is max" : "y is max";

// We can store them in the integer
        int max1 = x > y ? x : y;

        System.out.println(max);
        System.out.println(max1);
    }
}

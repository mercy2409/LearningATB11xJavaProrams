package ex_07_Increment_Decrement_Op;

public class Lab076_Exp2 {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(++a + ++a);
        System.out.println(a);

        // A = ++a
        // B = ++a

        // A = ++a --> Exp A = 11 a = 11
        // B = ++a --> Exp B = 12 a = 12
        // value would be 23 and a = 12
    }
}

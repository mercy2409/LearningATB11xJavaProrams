package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {

        int val = 200;
        //byte b = val; // Invalid - Narrowing - Implicit cast is not allowing in terms of narrowing

        byte b2 = (byte)val; // Valid Narrowing - Explicit Casting - Allowed. But data loss will happen

        System.out.println(b2);

    }
}

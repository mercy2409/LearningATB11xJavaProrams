package ex_07_Increment_Decrement_Op;

public class Lab074_Advance_ID {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a++ + a);


        // A+B (take like this)
        // A -> a++ --> ExpA -> 10, a = 11
        // +
        // B -> a- ExpB -> 11, a = 11
        //A+B -> ExpA + ExpB -> 10+11 (Note: Finally take only expression value)

        // Line no. / a / Exp
        // 6 / 10 / NA
        // 7 / 11 / 10+11 -> 21


    }
}

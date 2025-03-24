package ex_07_Increment_Decrement_Op;

public class Lab070_ID_Op {
    public static void main(String[] args) {
       // pre increment -> ++operant
       // value is incremented first and then stored in the result
       // value increased by 1

            int a = 10;
            int b = ++a; // 10+1 -> b - 11
            System.out.println(b); //11
            System.out.println(a); //11

        // Express and Result Table
        // Line 9 / a /  Result b
        // Line 10  / 10 / NA
        // Line 11 / 11(NA) / 11
        // Line 12 / 11/ 11(NA)

    }
}

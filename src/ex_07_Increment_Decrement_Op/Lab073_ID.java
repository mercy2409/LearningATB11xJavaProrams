package ex_07_Increment_Decrement_Op;

public class Lab073_ID {
    public static void main(String[] args) {


        int a = 10;
        int result = a++;

        System.out.println(a);
        System.out.println(result);

       // Line / a/ result
        //  7  / 10/ NegativeArraySizeException
        //  8  / 11 (a value is increased by +1)/ expression value is 10 as we are assigning first
        // 10/ 11/ NA
        // 11/ NA (not printing) / 10
        //Reference 14th March 17:54seconds

    }
}

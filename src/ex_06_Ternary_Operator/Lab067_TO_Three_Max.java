package ex_06_Ternary_Operator;

public class Lab067_TO_Three_Max {
    public static void main(String[] args) {



    int n1 = 2;
    int n2 = 9;
    int n3 = -11;

    //Logic building formula

    //Step 1 : Find inputs/ outputs
    //I/O n1, n2, n3 - int
    //O/P String  -> Max number

    //Step 2 - Rough logic, Think about it.
    // n1 > n2 and n1 > n3 -> n1
    // n2 > n3 and n2 > n1 -> n2
    // 2 line first 2 compare then n3

    int max = (n1>n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
        System.out.println("max is" + max);

        // A (n1>n2) ? (n1 > n3) ? n1 : n3 :
        // B ((n2 > n3) ? n2 : n3)


     }
}

package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {


        long ph_no = 9903189600l;
        //short s = ph_no; //Implicit
        short s = (short) ph_no; //Explicit Casting - Narrowing
        System.out.println(s);
    }
}

package ex_05_TypeCasting;

import org.w3c.dom.ls.LSOutput;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {


        int course = 100;
                float GST = 18.45f;
                        //int total =course+GST: //NARROW -> Implicit
        int total1 = course+(int)GST; // Narrow -> Explicit
        System.out.println(total1);

        float total2 = course+GST; // Widening - Auto - Implicit
        float total3 = (float)course+GST; // Widening - Auto - Explicit
        System.out.println(total2);
        System.out.println(total3);
    }
}

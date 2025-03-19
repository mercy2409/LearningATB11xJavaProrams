package Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {

    // Nested ternary
        // result = condition1 ? expression1 : (condition2 ? expression2; expression3;

        int number = 25;
        String result = (number > 10) ? "A" : "B";
        //String result2 = (number > 10) ? "A" : (number > 20 ? "N>20" : "N<20");
        String result2 = (number > 10) ?  (number > 20 ? "N>20" : "N<20") : "B"; //ideally we should add here
    //March 13th 47:30sec

        System.out.println(result);
        System.out.println(result2);
    }
}

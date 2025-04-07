package ex_10_For_Loop;

public class Lab_103_For_If_Loop {
    public static void main(String[] args) {

        for (int mercy = 0; mercy < 18; mercy++){ //0 to 17 total 18 times

            if (mercy > 15){
                System.out.println("Gift from dad");
            }
            else {
                System.out.println("No gift");
                //break;
            }
        }
    }
}

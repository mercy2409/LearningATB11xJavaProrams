package ex_09_Switch;

public class Lab_094_JDK13Above {
    public static void main(String[] args) {
        //JDK > 13

        int itemCode = 006;

        switch (itemCode) {
            case 001, 002, 005:
                System.out.println("All of them are electronic gadget");
                break;
            case 003, 004, 006:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}

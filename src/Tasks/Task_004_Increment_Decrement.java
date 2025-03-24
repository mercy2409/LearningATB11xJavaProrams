package Tasks;

public class Task_004_Increment_Decrement {
    public static void main(String[] args) {
                    int a = 10;
            System.out.println(++a + a++ + a++);
            System.out.println(a);


            // A = ++a
            // B = a++
            // C = a++

        // a = 10 --> A = 11/ na
        // a = 11 --> B = 11 / 12
        // a = 12 --> C = 12 +1 = 13


    }
}

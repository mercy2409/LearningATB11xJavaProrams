package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {

        char c1= 'A'; //A-Z, a-z, !@#$%etc.,
        //char c2 = "A"; // this is a char, it is string
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; //blank space

        //Escape Char

        char new_line ='\n';
        char tab_line ='\t';
        char back_space ='\b';
        char carriage_return ='\r';

        // System.out.println("MercySwamy");
        System.out.println("Mercy"+new_line+"Swamy");
        System.out.println("Mercy"+tab_line+"Swamy");
        System.out.println("Mercy"+back_space+"Swamy");
        System.out.println("Mercy"+carriage_return+"Swamy");

        System.out.println("Mercy"+carriage_return+"Swamy");

        System.out.println("Hi, This is First line \n This is Second line \n This is Third line");
        System.out.println("Hi, This is First line" +new_line+ "This is Second line" +new_line+ "This is Third line");

        char c10 ='A';
        //ASCII, (limited numbers) - A- 65

        //Escape sequences  \t, \b, \n, \r, \f, \', \", \\

        char rupees = '₹';
        System.out.println(rupees);

        char smily = '\u1f60';  // :)
        System.out.println(smily);


    }
}

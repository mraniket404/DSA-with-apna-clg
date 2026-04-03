/*
 NARROWING CONVERSION (Explicit)

 Definition:
बड़े data type को छोटे data type में convert करना

 Example:
double → float → int → short → byte

 Important Points:
 Manual casting करना पड़ता है
 Data loss हो सकता है
 Decimal part remove हो जाता है
*/

public class NarrowingConversion {
    public static void main(String[] args) {

        double x = 10.75;
        int y = (int) x;

        System.out.println("Final value: " + y);
    }
}
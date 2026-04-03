/*
📘 WIDENING CONVERSION (Implicit)

👉 Definition:
छोटे data type को बड़े data type में convert करना

👉 Example:
byte → short → int → long → float → double

👉 Important Points:
✔ Automatic conversion होता है
✔ Safe conversion (data loss नहीं होता)
✔ Casting की जरूरत नहीं होती
*/

public class WideningConversion {
    public static void main(String[] args) {

        byte a = 10;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        System.out.println("Final value: " + f);
    }
}
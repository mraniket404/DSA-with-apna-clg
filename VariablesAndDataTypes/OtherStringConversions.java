/*
 OTHER STRING CONVERSIONS

 Definition:
String को अन्य data types में convert करना

 Methods:
Double.parseDouble()
Float.parseFloat()
Long.parseLong()

 Important Points:
  Numeric string होना जरूरी है
*/

public class OtherStringConversions {
    public static void main(String[] args) {

        double d = Double.parseDouble("3.14");
        float f = Float.parseFloat("2.5");
        long l = Long.parseLong("999");

        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
    }
}
/*
 AUTOBOXING & UNBOXING

 Definition:
Primitive type और Object type के बीच conversion

 Autoboxing:
int → Integer

 Unboxing:
Integer → int

 Important Points:
 Java automatically handle करता है
Interview में important topic है
*/

public class AutoboxingUnboxing {
    public static void main(String[] args) {

        int a = 100;
        Integer obj = a;   // Autoboxing

        int b = obj;       // Unboxing

        System.out.println("Autoboxing: " + obj);
        System.out.println("Unboxing: " + b);
    }
}

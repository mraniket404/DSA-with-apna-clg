/*
 INT TO STRING CONVERSION

 Definition:
Integer को String में convert करना

 Method:
Integer.toString()

 Important Points:
Output text form में मिलता है
*/

public class IntToString {
    public static void main(String[] args) {

        int num = 456;
        String s = Integer.toString(num);

        System.out.println("Converted value: " + s);
    }
}
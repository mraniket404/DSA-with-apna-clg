/*
 STRING TO INT CONVERSION

 Definition:
String को integer में convert करना

 Method:
Integer.parseInt()

 Important Points:
 Only numeric string allowed
 "abc" देने पर error आएगा
*/

public class StringToInt {
    public static void main(String[] args) {

        String s = "123";
        int num = Integer.parseInt(s);

        System.out.println("Converted value: " + num);
    }
}
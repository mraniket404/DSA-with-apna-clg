/*
 USER INPUT CONVERSION

 Definition:
User द्वारा दिए गए String input को number में convert करना

 Method:
Integer.parseInt()

 Important Points:
 Input numeric होना चाहिए
 Wrong input देने पर runtime error आएगा
*/

import java.util.Scanner;

public class UserInputConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String input = sc.next();

        int num = Integer.parseInt(input);

        System.out.println("Converted value: " + num);

        sc.close();
    }
}
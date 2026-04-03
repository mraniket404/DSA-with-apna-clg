/* BOOLEAN CONVERSION

 Definition:
Boolean type को दूसरे type में convert नहीं कर सकते

 Important Points:
 boolean → int (Not allowed)
 boolean → String (direct नहीं)

 Only true/false store करता है
*/

public class BooleanConversion {
    public static void main(String[] args) {

        boolean flag = true;
        System.out.println("Value: " + flag);

        // int x = flag; // ERROR
    }
}
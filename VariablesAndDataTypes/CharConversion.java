/*
 CHAR CONVERSION

 Definition:
char और int के बीच conversion

 Important Points:
 char internally ASCII value store करता है
'A' = 65, 'B' = 66
 दोनों direction में conversion possible है
*/

public class CharConversion {
    public static void main(String[] args) {

        char ch = 'A';
        int ascii = ch;
        System.out.println("Char to int: " + ascii);

        int num = 66;
        char ch2 = (char) num;
        System.out.println("Int to char: " + ch2);
    }
}
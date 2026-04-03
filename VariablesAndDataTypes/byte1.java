public class byte1 {
    public static void main(String[] args) {
       // byte data type can store values from -128 to 127
        byte a = 10;
        byte b = 20;
        byte c =  (byte) (a + b);
        System.out.println(c);
        
        // char data type can store a single character and is represented by single quotes
        char d = 'A';
        char e = 'B';
        char f = (char) (d + e);
        System.out.println(f);

        // boolean data type can store only two values: true or false
        boolean g = true;   
        boolean h = false;
        System.out.println(g);
        System.out.println(h);

        // short data type can store values from -32,768 to 32,767
        short i = 1000;
        short j = 2000;
        short k = (short) (i + j);
        System.out.println(k);

        // long data type can store values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 
        long l = 1000000000L;
        long m = 2000000000L;
        long n = l + m;
        System.out.println(n);  

        // float data type can store decimal values and is represented by a single precision 32-bit IEEE 754 floating point
        float o = 3.14f;
        float p = 2.71f;
        float q = o + p;    
        System.out.println(q);

        // double data type can store decimal values and is represented by a double precision 64-bit IEEE 754 floating point
        double r = 3.14;
        double s = 2.71;
        double t = r + s;
        System.out.println(t);

        // String data type can store a sequence of characters and is represented by double quotes
        String u = "Hello";
        String v = "World";
        String w = u + " " + v;
        System.out.println(w);

        // var data type can store any type of data and is inferred by the compiler based on the value assigned to it
        var x = 10; // inferred as int  
        var y = 3.14; // inferred as double
        var z = "Hello"; // inferred as String
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);  
        
        // final data type is used to declare constants, which are variables that cannot be changed once they are assigned a value
        final int MAX_VALUE = 100;
        System.out.println(MAX_VALUE);

        // var data type can also be used to declare constants, but it is not recommended as it can lead to confusion and errors
        final var MIN_VALUE = 0; // inferred as int
        System.out.println(MIN_VALUE);  

        // byte data type can also be used to declare constants, but it is not recommended as it can lead to confusion and errors
        final byte MIN_BYTE_VALUE = -128;
        final byte MAX_BYTE_VALUE = 127;
        System.out.println(MIN_BYTE_VALUE);
        System.out.println(MAX_BYTE_VALUE);

        // char data type can also be used to declare constants, but it is not recommended as it can lead to confusion and errors
        final char MIN_CHAR_VALUE = '\u0000';
        final char MAX_CHAR_VALUE = '\uffff';
        System.out.println(MIN_CHAR_VALUE);
        System.out.println(MAX_CHAR_VALUE);

        // boolean data type can also be used to declare constants, but it is not recommended as it can lead to confusion and errors
        final boolean TRUE_VALUE = true;
        final boolean FALSE_VALUE = false;
        System.out.println(TRUE_VALUE);
        System.out.println(FALSE_VALUE);

        // short data type can also be used to declare constants, but it is not recommended as it can lead to confusion and errors  
        final short MIN_SHORT_VALUE = -32768;
        final short MAX_SHORT_VALUE = 32767;
        System.out.println(MIN_SHORT_VALUE);
        System.out.println(MAX_SHORT_VALUE);
        // long data type can also be used to declare constants, but it is not recommended as it can lead to confusion and errors
        final long MIN_LONG_VALUE = -9223372036854775808L;  
        final long MAX_LONG_VALUE = 9223372036854775807L;
        System.out.println(MIN_LONG_VALUE);
        System.out.println(MAX_LONG_VALUE); 
        // float data type can also be used to declare constants, but it is not recommended as it can lead to confusion and errors
        final float MIN_FLOAT_VALUE = 1.4E-45f;
        final float MAX_FLOAT_VALUE = 3.4028235E38f;
        System.out.println(MIN_FLOAT_VALUE);
        System.out.println(MAX_FLOAT_VALUE);
        // double data type can also be used to declare constants, but it is not recommended as
        // it can lead to confusion and errors
        final double MIN_DOUBLE_VALUE = 4.9E-324;
        final double MAX_DOUBLE_VALUE = 1.7976931348623157E308;
        System.out.println(MIN_DOUBLE_VALUE);
        System.out.println(MAX_DOUBLE_VALUE);

        // String data type can also be used to declare constants, but it is not recommended as it can lead to confusion and errors
        final String GREETING = "Hello, World!";
        System.out.println(GREETING);
        














































            
    }
}

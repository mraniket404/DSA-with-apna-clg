
public class BinaryOperators {
    public static void main(String[] args) {
        int a = 15, b = 4;
        
        // 1. Addition (+)
        int sum = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + sum);  // 19
        
        // 2. Subtraction (-)
        int difference = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);  // 11
        
        // 3. Multiplication (*)
        int product = a * b;
        System.out.println("Multiplication: " + a + " × " + b + " = " + product);  // 60
        
        // 4. Division (/) - Integer division
        int quotient = a / b;
        System.out.println("Division: " + a + " ÷ " + b + " = " + quotient);  // 3 (not 3.75)
        
        // 5. Modulus (%) - Remainder
        int remainder = a % b;
        System.out.println("Modulus: " + a + " % " + b + " = " + remainder);  // 3
        
        // Decimal division with double
        double preciseDivision = (double)a / b;
        System.out.println("Precise Division: " + preciseDivision);  // 3.75
    }
}
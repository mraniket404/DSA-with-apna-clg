public class LogicalOperatorsBasic {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, d = 5;
        
        // 1. Logical AND (&&) - दोनों true होने चाहिए
        System.out.println("=== AND Operator (&&) ===");
        System.out.println((a < b) && (b < c));    // true && true = true
        System.out.println((a < b) && (b > c));    // true && false = false
        System.out.println((a > b) && (b < c));    // false && true = false
        System.out.println((a > b) && (b > c));    // false && false = false
        
        // 2. Logical OR (||) - कम से कम एक true हो
        System.out.println("\n=== OR Operator (||) ===");
        System.out.println((a < b) || (b < c));    // true || true = true
        System.out.println((a < b) || (b > c));    // true || false = true
        System.out.println((a > b) || (b < c));    // false || true = true
        System.out.println((a > b) || (b > c));    // false || false = false
        
        // 3. Logical NOT (!) - उलटा करना
        System.out.println("\n=== NOT Operator (!) ===");
        boolean condition = (a < b);
        System.out.println("Original: " + condition);     // true
        System.out.println("After NOT: " + !condition);   // false
        
        // 4. Logical XOR (^) - Exactly एक true हो
        System.out.println("\n=== XOR Operator (^) ===");
        System.out.println((a < b) ^ (b < c));    // true ^ true = false
        System.out.println((a < b) ^ (b > c));    // true ^ false = true
        System.out.println((a > b) ^ (b < c));    // false ^ true = true
        System.out.println((a > b) ^ (b > c));    // false ^ false = false
    }
}
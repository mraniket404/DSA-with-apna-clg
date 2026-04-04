public class UnaryOperators {
    public static void main(String[] args) {
        int x = 10;
        
        // 1. Unary Plus (+)
        int positive = +x;
        System.out.println("Unary Plus: +" + x + " = " + positive);  // 10
        
        // 2. Unary Minus (-)
        int negative = -x;
        System.out.println("Unary Minus: -" + x + " = " + negative);  // -10
        
        // 3. Increment (++) - Two types
        int a = 5;
        
        // Post-increment (a++): पहले use करो, फिर बढ़ाओ
        System.out.println("Post-increment: " + a++);  // 5 (पहले print, फिर बढ़ा)
        System.out.println("After post-increment: " + a);  // 6
        
        int b = 5;
        // Pre-increment (++b): पहले बढ़ाओ, फिर use करो
        System.out.println("Pre-increment: " + ++b);  // 6 (पहले बढ़ाया, फिर print)
        System.out.println("After pre-increment: " + b);  // 6
        
        // 4. Decrement (--) - Two types
        int c = 5;
        
        // Post-decrement (c--): पहले use करो, फिर घटाओ
        System.out.println("Post-decrement: " + c--);  // 5
        System.out.println("After post-decrement: " + c);  // 4
        
        int d = 5;
        // Pre-decrement (--d): पहले घटाओ, फिर use करो
        System.out.println("Pre-decrement: " + --d);  // 4
        System.out.println("After pre-decrement: " + d);  // 4
        
        // 5. Logical NOT (!) - Boolean ke liye
        boolean flag = true;
        System.out.println("Original: " + flag);      // true
        System.out.println("After NOT: " + !flag);    // false
        System.out.println("Double NOT: " + !!flag);  // true
    }
}
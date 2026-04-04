public class RelationalOperatorsBasic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;
        
        // 1. Equal to (==)
        System.out.println(a + " == " + b + " : " + (a == b));  // false
        System.out.println(a + " == " + c + " : " + (a == c));  // true
        
        // 2. Not equal to (!=)
        System.out.println(a + " != " + b + " : " + (a != b));  // true
        System.out.println(a + " != " + c + " : " + (a != c));  // false
        
        // 3. Greater than (>)
        System.out.println(a + " > " + b + " : " + (a > b));    // false
        System.out.println(b + " > " + a + " : " + (b > a));    // true
        
        // 4. Less than (<)
        System.out.println(a + " < " + b + " : " + (a < b));    // true
        System.out.println(b + " < " + a + " : " + (b < a));    // false
        
        // 5. Greater than or equal (>=)
        System.out.println(a + " >= " + c + " : " + (a >= c));  // true
        System.out.println(a + " >= " + b + " : " + (a >= b));  // false
        
        // 6. Less than or equal (<=)
        System.out.println(a + " <= " + c + " : " + (a <= c));  // true
        System.out.println(b + " <= " + a + " : " + (b <= a));  // false
    }
}
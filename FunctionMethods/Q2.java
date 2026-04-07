public class Q2 {
    public static int[] swip(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};  
    }
    
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        // frist 
         // int temp = a;
        // a=b;
        // b=temp;
        // System.out.println(a);
        // System.out.println(b);
        
        //second two type me likh sakte he 
        //1st
        System.out.println(swip(a,b)[0]);
        System.out.println(swip(a,b)[1]);
        
        //2nd
        // int[] swapped = swip(a, b);
        
        // System.out.println("a = " + swapped[0]);
        // System.out.println("b = " + swapped[1]);

       
    }
}
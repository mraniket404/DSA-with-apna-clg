public class Q2 {
    public static void main(String[] args) {
        int a  = 2;
        int b = 5;
         
        int temp = a;

        System.out.println("the value of a is : "+ (a=b));        
        System.out.print("the value of b is : "+(b=temp));        
    }
}

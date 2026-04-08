import java.util.Scanner;
public class Q3 {
    public static int product(int num1, int num2) {
        int result = num1*num2 ;
        return result;
    }
 public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the 1st value :");
    int a = sc.nextInt();
    System.out.print("Enter the 2st value :");
    int b = sc.nextInt();

    System.out.println("product is : "+ product(a,b));

 }   
}

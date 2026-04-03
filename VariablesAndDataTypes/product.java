import java.util.Scanner;



    

public class product {

    public static int product(int a, int b) {
        int result = a * b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number"); 
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
System.out.println("the product of " + num1 + " and " + num2 + " is: " + product(num1, num2));
        // product(num1, num2);


    }
}

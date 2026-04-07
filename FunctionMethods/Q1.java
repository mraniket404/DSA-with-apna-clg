import java.util.Scanner;

public class Q1 {

    public static int calculate(int num1 , int num2) {
        int sum = num1+num2;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st num : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd num : ");
        int b = sc.nextInt();
        int sum = calculate(a,b);
        System.out.print("The Ans is : " + sum  );
    }
}

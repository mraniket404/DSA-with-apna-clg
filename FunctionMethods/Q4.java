import java.util.Scanner;

public class Q4 {

    public static int factorial(int num) {
        int result =1;
        for (int i = 1;i<=num;i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("factorial of "+ n +" is " + factorial(n));
    }    
}

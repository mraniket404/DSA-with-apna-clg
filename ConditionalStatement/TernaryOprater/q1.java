import java.util.Scanner;

public class q1 {

    public static String even(int num) {
       String result =  ((num % 2) == 0) ? "Enven" : "odd";
       return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("your number is : "+ even(num));
    }
}

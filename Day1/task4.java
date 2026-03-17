import java.util.Scanner;

public class task4 {
    public static String prime(int num) {
        if (num <= 1) {
            return "Not a prime number";
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "Not a prime number";
            }
        }
        return "Prime number";
        
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(prime(num));
        }
    }


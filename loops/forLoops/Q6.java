import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        
        do {
            int fact = 1;
            int i = 1;
            
            System.out.println("Enter the number : ");
            num = sc.nextInt();
            
            // Negative numbers ka factorial define nahi hota
            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers!");
            } 
            else if (num == 0) {
                System.out.println("Factorial of 0 is: 1");
            }
            else {
                for (i = 1;i <= num;i++){
                    fact*=i;
                }
                
                System.out.println("Factorial of " + num + " is: " + fact);
            }
            
            System.out.println("\nPress 1 to continue, 0 to exit: ");
            choice = sc.nextInt();
            
        } while (choice == 1);
        
        System.out.println("Thank you!");
        sc.close();
    }
}
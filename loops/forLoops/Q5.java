import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter u r number to check prime or not : ");
        int num = sc.nextInt();
        boolean isprime = true;
        for (int i =2;i<=Math.sqrt(num);i++){
            if (num%i==0) {
                isprime = false;
            }

        }
        if (isprime==true) {
            System.out.println("the number is prime");
        }else{
            System.out.println("the number if not a prime");
        }
    }
}

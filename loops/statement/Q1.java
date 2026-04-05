import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter u r number : ");
            int n = sc.nextInt();
            if (n%10==0) {
                break;
            }
            System.out.println(n);
        } while (true);
        System.out.println("i am out");
    }
}

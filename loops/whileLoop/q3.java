import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i =1;
        int sum = 0;

        while (i<=n) {
            sum += i;
            i++;
        }
        System.out.print("frist natural number sum is : " + sum);

        
    }
}

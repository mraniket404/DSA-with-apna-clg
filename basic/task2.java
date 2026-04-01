import java.util.Scanner;
public class task2 {
    public static double intrest(int p, int r, int t) {
        return (p * r * t) / 100.0;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principale number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter rate number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter time number: ");
        int num3 = sc.nextInt();
        System.out.println(intrest(num1, num2, num3));

    }
}

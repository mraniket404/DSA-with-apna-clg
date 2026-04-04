import java.util.Scanner;
public class q4 {
    public static int greater (int num1 , int num2 , int num3) {
        int result ;
        if(num1 >= num2 && num1 >= num3){
            result = num1;
        }else if (num2 >= num1 && num2 >= num3){
            result = num2;
        }else {
            result = num3;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter frist number :");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number :");
        int num2 = sc.nextInt();
        System.out.print("Enter third number :");
        int num3 = sc.nextInt();

        System.out.print("greater number is : " + greater(num1,num2,num3));
    }
}

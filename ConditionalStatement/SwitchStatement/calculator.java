import java.util.Scanner;
public class calculator {
    public static int cal(int num1 , char ch , int num2) {
        int result = 0;
            switch(ch) {
                case '+': result = (num1+num2);
                    break;
                case '-': result = (num1-num2);
                    break;
                case '*': result = (num1*num2);
                    break;
                case '/': result = (num1/num2);
                    break;
                case '%': result = (num1%num2);
                    break;
                default:
                    break;
            }
            return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================Calculator=================");
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Action +,-,*,/,%");
        char ch = sc.next().charAt(0);
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("u r result is : " + cal(num1,ch,num2));

    }
}

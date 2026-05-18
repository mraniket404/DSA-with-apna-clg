// student pass or fail hoga 

import java.util.Scanner;

public class q5 {

    public static String result(int marks) {
        String result = (marks >= 33)?"Pass" : "Fail";
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = sc.nextInt();
        System.out.println("Result is : " + result(marks));
    }
}

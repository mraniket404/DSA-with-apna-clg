//income tax calculate

import java.util.Scanner;

public class q3 {

    public static float calculate(float income) {
        float result = 0;
        if (income <= 500000){
           result = 0;
        }else if (income >= 500000 && income < 1000000){
            result = (float) (income * 0.2);
        }else {
            result = (float)(income*0.3);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter u r income :");
        float income = sc.nextFloat();

       System.out.println("your tax is " + calculate(income));

    }
}

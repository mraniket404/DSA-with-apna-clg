import java.util.*;

public class creatingArray {

    public static int result(int marks[]) {

        int total = 0;

        for(int i = 0; i < 3; i++) {
            total = total + marks[i];
        }

        return total;
    }

    public static void main(String[] args) {

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maths marks : ");
        marks[0] = sc.nextInt();

        System.out.print("Enter the physics marks : ");
        marks[1] = sc.nextInt();

        System.out.print("Enter the chemistry marks : ");
        marks[2] = sc.nextInt();

        int total = result(marks);

        System.out.println("Your total marks is : " + total);

        if(total >= 100) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
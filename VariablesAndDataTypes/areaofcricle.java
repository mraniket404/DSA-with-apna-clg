import java.util.Scanner;
public class areaofcricle {
    public static double radius(double R) {
        return Math.PI * R * R;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double R = sc.nextDouble();

        System.out.println("The area of the circle with radius " + R + " is: " + radius(R));}
}

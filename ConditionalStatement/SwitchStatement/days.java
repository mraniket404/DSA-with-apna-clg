import java.util.Scanner;

public class days {
    public static String Day(int num) {
        String result = "";
        switch(num) {
            case 1:
                result = "somvar";
                break;
            case 2:
                result = "mangalvar";
                break;
            case 3:
                result = "budhvar";
                break;
            case 4:
                result = "guruvar";
                break;
            case 5:
                result = "shkravar";
                break;
            case 6:
               result = "shanivar";
                break;
            case 7:
                result = "ravivar";
                break;
            default:
                result = "not avalable";
                break;
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between 1 to 7 to check which day : ");
        int num = sc.nextInt();

        System.out.println("your day is : " + Day(num));

        
    }

}

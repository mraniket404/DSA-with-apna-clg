//reverse of a number

public class Q3 {
    public static void main(String[] args) {
        
        for (int n = 1089980;n>0;){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n = n/10;
        }
        // System.out.println();
    }
}

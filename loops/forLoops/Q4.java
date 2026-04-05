
public class Q4 {
    public static void main(String[] args) {
        for (int n = 10899;n>0;){
            int rev = 0;
            int lastdigit = n%10;
            rev = (rev*10) + lastdigit;
            System.out.print(rev);
            n =n/10;
        }
    }
}

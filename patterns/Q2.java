// inverted star pattern
// * * * *
// * * *
// * *
// *
public class Q2 {
    public static void main(String[] args) {
        for (int line =7;line>=1;line--){
            for (int star=line;star>=1;star--){
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}

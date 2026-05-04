
public class Q1 {
    public static void hello_reactangle(int row, int col) {
        //outer loop
        for (int i = 1; i <= row; i++) {
            //inner-colomn
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
        
    }
    public static void main(String[] args) {
        hello_reactangle(4, 5);
    }
    
}

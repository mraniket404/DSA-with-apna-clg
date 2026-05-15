public class subArray {
    public static void printSubArray(int numbers[]) {
        int totalSubArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j< numbers.length; j++){
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    totalSubArray++;
                }               
                 System.out.println();
            }
                System.out.println();
        }
        System.out.println("Total number of subarrays: " + totalSubArray);
       
    }
    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,5,6,7,8,9};
        printSubArray(numbers);
    }
}

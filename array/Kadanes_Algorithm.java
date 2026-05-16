public class Kadanes_Algorithm {

    public static void kadanes(int numbers []) {
        int maxSum = Integer.MIN_VALUE;
        int current_Sum = 0;
        for (int i  = 0 ; i < numbers.length; i++) {
            current_Sum  += numbers[i];
            if (current_Sum < 0) {
                current_Sum = 0;
            }
            if (current_Sum > maxSum) {
                maxSum = current_Sum;
            }
        }
        System.out.println("Maximum sum of contiguous subarray is: " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2 , -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}

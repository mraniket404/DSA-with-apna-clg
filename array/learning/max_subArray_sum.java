public class max_subArray_sum {
     public static void maxSubArray_sum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j< numbers.length; j++){
                int end = j;
                int currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += numbers[k];                    
                }               
                 System.out.println("Current sum: " + currentSum);
                 if (currentSum > maxSum) {
                    maxSum = currentSum;                    
                 }
            }
                System.out.println();
        }
        System.out.println("Maximum sum of subarray: " + maxSum);       
    }
    public static void main(String[] args) {
        int numbers [] = {1,-2,6,-1,3};
        maxSubArray_sum(numbers);
    }
}

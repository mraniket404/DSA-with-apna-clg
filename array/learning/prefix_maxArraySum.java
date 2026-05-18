public class prefix_maxArraySum {
    public static void prefix_maxArraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int prefixSum[] = new int[numbers.length];
        prefixSum[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefixSum[i] = prefixSum[i-1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j< numbers.length; j++){
                int end = j;
                currentSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start - 1];
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
        prefix_maxArraySum(numbers);
    }
}

public class largest_number {

    public static int largest_number(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            } if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is : " + smallest);
        return largest;
        
    }

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println("Largest number is : " + largest_number(numbers));
    }
}

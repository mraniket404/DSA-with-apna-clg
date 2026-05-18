public class reverse_array {
    public static void reverse(int numbers[]) {
        int frist = 0;
        int last = numbers.length - 1;
        while (frist < last) {
            int temp = numbers[last];
            numbers[last] = numbers[frist];
            numbers[frist] = temp;
            frist++;
            last--;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        
    }
    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,5,6,7,8,9};
        reverse(numbers);
    }
}


public class linear_search {
    public static void linear_search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
    
        int numbers [] = {2,3,4,5,6,7,8,10,22,23};
        int key = 8;
        linear_search(numbers, key);
    }
}

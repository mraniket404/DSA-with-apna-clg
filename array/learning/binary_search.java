public class binary_search {
    public static int  binary_search (int number[]) {
        int start = 0;
        int end = number.length - 1;
        int target = 78;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == target) {
                return mid;
            } else if (number[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
 public static void main(String[] args) {
    int[] number = {14,23,34,45,56,67,78,89,90,92};
    System.out.println("the index is " + binary_search(number));
 }   
}

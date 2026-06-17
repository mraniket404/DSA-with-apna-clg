import java.util.*;
// start index and end index 
public class inbuiltSort2 {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        Arrays.sort(arr, 1, 5); // sort from index 1 to 4 (end index is exclusive) 5th element is not included in sorting
           for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}

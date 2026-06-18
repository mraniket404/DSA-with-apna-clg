import java.util.*;

// sort in reverse order with starting and ending index
public class inbuiltSort4 {
  public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 3, 2}; // primitive type array
        
        Arrays.sort(arr, 1, 4, Collections.reverseOrder()); // sort from index 1 to 3 (end index is exclusive) 4th element is not included in sorting
           for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }   
  }  
}
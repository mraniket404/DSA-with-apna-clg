import java.util.*;

// sort in reverse order
public class inbuiltSort3 {
  public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 3, 2}; // use Integer karna padega here because Collections.
        // reverseOrder() works with objects, not with primitive types like int num = sc.nextInt(); 
        
           Arrays.sort(arr, Collections.reverseOrder()); // sort in reverse order
           for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
    
  }  
}

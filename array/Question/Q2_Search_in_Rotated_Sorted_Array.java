public class Q2_Search_in_Rotated_Sorted_Array {
    public static int search(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        // Binary search in the rotated sorted array
        while (left <= right) {
            int mid = left + (right - left) / 2;
                // Check if the target is found
            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (nums[left] <= nums[mid]) {
                // Target is in the left half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // Right half is sorted
                // Target is in the right half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; 
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
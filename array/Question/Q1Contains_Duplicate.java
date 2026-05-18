public class Q1Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

public static void main(String[] args) {
    int[] nums = {1, 2, 3, 1};
    System.out.println(containsDuplicate(nums));
}
}
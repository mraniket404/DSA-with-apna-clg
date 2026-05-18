public class TrappedWater {

    public static int trap(int height []) {
        //calculate left max boundary for each element

        int left_max[] = new int[height.length];
          left_max[0] = height[0];
             for (int i = 1; i < height.length; i++) {
             left_max[i] = Math.max(height[i], left_max[i - 1]);
        }

        //calculate right max boundary for each element
        int right_max[] = new int[height.length];
        right_max[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }
        
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
           int water_level = Math.min(left_max[i], right_max[i]);
            trappedWater += water_level - height[i];
        }
      return trappedWater;
    
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 3, 2, 5};
        
        System.out.println("Total trapped water is: " + trap(height));
    }
}   
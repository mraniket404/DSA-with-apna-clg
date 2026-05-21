public class Q4_TrappingRainWater {
    public static int trappedWater(int height[]) {

        int n = height.length; // length store kiya hai array ka

        // left side ka maximum store karna.
        int leftMax[] = new int[n];

        leftMax[0] = height[0];

        for(int i = 1; i < n; i++) {
            //current building aur previous left maximum me jo bada hai store karo.    
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // right side ka maximum store karna.
        int rightMax[] = new int[n];

        rightMax[n-1] = height[n-1];

        for(int i = n-2; i >= 0; i--) {

            rightMax[i] =
            Math.max(height[i],
                     rightMax[i+1]);
        }

        int trappedWater = 0;

        // loop
        for(int i = 0; i < n; i++) {

            // water level
            int waterLevel =
            Math.min(leftMax[i],
                     rightMax[i]);

            // trapped water
            trappedWater +=
            waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String args[]) {

        int height[] = {4,2,0,6,3,2,5};

        System.out.println(
            trappedWater(height)
        );
    }
}

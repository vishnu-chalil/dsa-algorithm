package com.learn.datastructures.twopointer.hard;

class TrappingRainWaterNSpace {
    public static void main(String[] args) {
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        trap(height);
    }
    public static int trap(int[] height) {

        int capacity = 0;
        int left = 0;
        int right = height.length - 1;
        int maxLefts[] = new int[height.length];
        int maxRights[] = new int[height.length];
        maxLefts[0] = height[0];
        maxRights[height.length - 1] = height[height.length - 1];

        for (int i = 1; i < height.length; i++) {
            if (maxLefts[i - 1] < height[i]) {
                maxLefts[i] = height[i];

            } else {
                maxLefts[i] = maxLefts[i - 1];
            }
        }

        for (int i = height.length - 2; i >= 0; i--) {
            if (maxRights[i + 1] < height[i]) {
                maxRights[i] = height[i];
            } else {
                maxRights[i] = maxRights[i + 1];
            }
        }
        for (int i = 1; i < height.length - 1; i++) {
            if (maxRights[i] < maxLefts[i]) {
                if (maxRights[i] - height[i] > 0) {
                    capacity = capacity + maxRights[i] - height[i];
                }
            } else {

                if (maxLefts[i] - height[i] > 0) {
                    capacity = capacity + maxLefts[i] - height[i];
                }

            }
        }
        return capacity;
    }
}
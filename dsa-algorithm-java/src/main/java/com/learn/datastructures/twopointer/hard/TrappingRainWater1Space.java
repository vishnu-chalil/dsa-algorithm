package com.learn.datastructures.twopointer.hard;

class TrappingRainWater1Space {
    public int trap(int[] height) {

        int capacity = 0;
        int left = 0;
        int right = height.length - 1;
        int maxLeft = height[0];
        int maxRight = height[height.length - 1];

        while (left < right) {
            if (height[left] <= height[right]) {
                left++;
                if (height[left] > maxLeft) {
                    maxLeft = height[left];
                }
                if (maxLeft - height[left] > 0) {
                    capacity = capacity + maxLeft - height[left];
                }
            } else {
                right--;
                if (height[right] > maxRight) {
                    maxRight = height[right];
                }
                if (maxRight - height[right] > 0) {
                    capacity = capacity + maxRight - height[right];
                }
            }
        }
        return capacity;
    }
}
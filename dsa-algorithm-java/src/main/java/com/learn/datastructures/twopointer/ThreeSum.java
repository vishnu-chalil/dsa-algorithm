package com.learn.datastructures.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum  {

    public static void main(String[] args) {
        int [] input = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        System.out.println(threeSum(input));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            while (i > 0 && (nums[i] == nums[i - 1])) {
                i++;
                if(i >= nums.length-2){
                    return result;
                }
            }

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {

                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                    ++left;
                    while (nums[left] == nums[left - 1] && left < right) {
                        ++left;
                    }
                } else if (sum > 0) {
                    --right;
                } else if (sum < 0) {
                    ++left;
                }
            }
        }
        return result;
    }
}

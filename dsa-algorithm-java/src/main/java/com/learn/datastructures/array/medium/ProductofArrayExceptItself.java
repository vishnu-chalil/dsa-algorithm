package com.learn.datastructures.array.medium;
/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 *
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 *
 * Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 * */
public class ProductofArrayExceptItself {

    public static void main(String[] args) {
        productExceptSelf(new int[]{1,2,3,4});
    }

    public static int[] productExceptSelf(int[] nums) {
        int inputLength = nums.length;
        int[] leftProd = new int[inputLength];
        int[] rightProd = new int[inputLength];
        int[] ans = new int[inputLength];
        leftProd[0] = nums[0];
        rightProd[inputLength - 1] = nums[inputLength - 1];
        for (int i = 0; i < nums.length - 1; i++) {

            leftProd[i + 1] = leftProd[i] * nums[i + 1];
            rightProd[inputLength - 2] = nums[inputLength - 2] * rightProd[inputLength - 1];
            inputLength--;
        }
        nums[0] = rightProd[1];
        nums[ans.length - 1] = leftProd[nums.length - 2];

        for (int i = 1; i < nums.length - 1; i++) {

            nums[i] = rightProd[i + 1] * leftProd[i - 1];

        }
        return nums;
    }

}

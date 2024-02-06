package com.learn.datastructures.twopointer;

class ThreeSumImproved {
    public static void main(String[] args) {
        int[] input = {-55,-24,-23, -12,-1, 1};
        int [] result = twoSum(input, -11);
        System.out.println(result[0]+ " "+result[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            int sum = numbers[left]+numbers[right];
            if(sum == target){
                result[0] = left+1;
                result[1] = right+1;
                return result;
            } else if( sum < target){
                left++;
            } else if( sum > target){
                right--;
            }
        }
        return result;
    }
}

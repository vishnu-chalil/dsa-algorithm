package com.learn.datastructures.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
    public static void main(String[] args) {
        int[] input = {2,4,15, 26,66};
        int [] result = twoSum(input, 19);
        System.out.println(result[0]+ " "+result[1]);
    }
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        int numloc = numbers.length - 1;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] >= target) {
                numloc = i;
                break;
            }

        }

        for (int i = numloc; i >= 0; i--) {
            //System.out.println("inside main for");

            if (tracker.containsKey(target - numbers[i])) {
                result[1] = tracker.get(target - numbers[i])+1;
                result[0] = i+1;
                //System.out.println("found loc");
                return result;
            } else {
                tracker.put(numbers[i],i);
            }
        }
        return result;
    }
}

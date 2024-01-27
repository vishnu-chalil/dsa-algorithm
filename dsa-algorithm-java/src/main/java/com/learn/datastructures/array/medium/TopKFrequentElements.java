package com.learn.datastructures.array.medium;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 *
 *
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 *
 * */
public class TopKFrequentElements {

    public static void main(String[] args) {



    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countList = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!countList.containsKey(nums[i])) {
                countList.put(nums[i], 1);

            } else {
                countList.put(nums[i], countList.get(nums[i]) + 1);

            }
        }
        int[] result = new int[k];
        List<Integer> resultArrayList = new ArrayList();
        countList.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(ele ->{
                    resultArrayList.add(ele.getKey());
                });

        for(int j =0 ; j < result.length; j++){
            result[j] = resultArrayList.get(j).intValue();
        }

        return result;
    }
}

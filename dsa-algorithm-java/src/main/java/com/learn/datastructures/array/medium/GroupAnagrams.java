package com.learn.datastructures.array.medium;


import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 *
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 *
 * Input: strs = ["a"]
 * Output: [["a"]]
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lowercase English letters.
 *
 * */

public class GroupAnagrams {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> dedupe = new HashMap<String, List<String>>();
        List<String> value = null;
        for (String str : strs) {

            String key = sortString(str);
            if (dedupe.containsKey(key)) {

                value = dedupe.get(key);
                value.add(str);
                dedupe.put(key, value);

            } else {

                value = new ArrayList<String>();
                value.add(str);
                dedupe.put(key, value);

            }

        }

        for(Map.Entry<String, List<String>> entry: dedupe.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }

    private static String sortString(String str) {
        String[] splitedString = str.split("");
        Arrays.sort(splitedString);
        return String.join("", splitedString);
    }
}

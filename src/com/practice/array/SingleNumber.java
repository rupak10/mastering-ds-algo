package com.practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {
        //int[] nums = {2,1,1,7,7};
        //int[] nums = {4,1,2,1,2};
        int[] nums = {1};
        System.out.println(singleNumberHashMap(nums));
    }

    /**
     * Complexity O(nlogn)
     */
    private static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int arrLength = nums.length;
        int i = 0;
        while (i <= arrLength-2) {
            if(nums[i] == nums[i+1]) {
                i += 2;
            }
            else {
                return nums[i];
            }
        }
        return nums[i];
    }

    /**
     * Complexity O(n)
     */
    private static int singleNumberHashMap(int[] nums) {
        int arrLength = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arrLength; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        for(Integer key : map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
}

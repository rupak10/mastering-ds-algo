package com.practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args) {
        //int[] nums = {1,2,3,1};
        int[] nums = {1};
        //int[] nums = {1,2,3};
        //System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate2(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        int arrLength = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < arrLength-1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * hash map approach
     */
    private static boolean containsDuplicate2(int[] nums) {
        int arrLength = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arrLength; i++) {
            if(map.containsKey(nums[i])) {
                return true;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

}

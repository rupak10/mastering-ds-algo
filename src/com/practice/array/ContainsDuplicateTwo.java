package com.practice.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateTwo {

    public static void main(String[] args) {
        /*int[] nums = {1,2,3,1};
        int k = 3;*/

        int[] nums = {1,0,1,1};
        int k = 1;

        /*int[] nums = {1,2,3,1,2,3};
        int k = 2;*/

//        int[] nums = {99, 99};
//        int k = 2;

        System.out.println(containsNearbyDuplicate(nums, k));
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        int arrLength = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arrLength; i++) {
            if(map.containsKey(nums[i])) {
                if(Math.abs(i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

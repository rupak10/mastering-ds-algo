package com.practice.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        //int[] nums = {3,2,3};
        int[] nums = {1};
        //int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        int arrLength = nums.length;
        int targetOccurence = arrLength/2;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arrLength; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
            if(map.get(nums[i]) > targetOccurence) {
                return nums[i];
            }
        }
        return -1;
    }
}

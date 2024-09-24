package com.practice.array;

import java.util.*;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        Map<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<m; i++) {
            if(map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i])+1);
            }
            else {
                map.put(nums1[i], 1);
            }
        }
        for(int i=0; i<n; i++){
            if(map.containsKey(nums2[i])) {
                set.add(nums2[i]);
            }
        }
        int len = set.size();
        int[] arr = new int[len];
        int i = 0;
        for(Integer num : set) {
            arr[i++] = num;
        }
        return arr;
    }
}

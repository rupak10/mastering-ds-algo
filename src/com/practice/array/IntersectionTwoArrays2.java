package com.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionTwoArrays2 {

    public static void main(String[] args) {
        int[] nums1 = {4,9,4};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> intersection = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] == nums2[j]) {
                intersection.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
        }
        int len = intersection.size();
        int[] intersectionArray = new int[len];
        int k = 0;
        for(Integer num : intersection){
            intersectionArray[k++] = num;
        }
        return intersectionArray;
    }
}

package com.practice.array;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m+n-1;
        int p1 = m-1;
        int p2 = n-1;

        while(p1>=0 && p2>=0)
        {
            if(nums1[p1]>nums2[p2])
            {
                nums1[p] = nums1[p1];
                p1--;
            }
            else{
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        //copy the remaining elements from num 2 , if any.
        while(p2>=0)
        {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
        System.out.println(Arrays.toString(nums1));
    }


    /*private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArr = new int[n+m];
        while(i < m && j < n) {
            if(nums1[i] == nums2[j]) {
                mergedArr[k++] = nums1[i];
                mergedArr[k++] = nums2[j];
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]) {
                mergedArr[k++] = nums1[i];
                i++;
            }
            else {
                mergedArr[k++] = nums2[j];
                j++;
            }
        }

        while (i < m) {
            mergedArr[k++] = nums1[i];
            i++;
        }

        while (j < n) {
            mergedArr[k++] = nums2[j];
            j++;
        }

        System.arraycopy(mergedArr, 0, nums1, 0, mergedArr.length);
    }*/


}

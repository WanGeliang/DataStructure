package LeetCode;

import java.util.Arrays;

public class leetcode_88 {
    public static void main(String[] args) {
        int[] merge = merge(new int[]{1, 2, 3}, 3, new int[]{2, 5, 6}, 3);
        System.out.println(Arrays.toString(merge));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;

        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                nums1[k++]=nums1[i++];
            }else if(nums1[i]>nums2[j]){
                nums1[k++]=nums2[j++];
            }else if(nums1[i]==nums2[j]){
                nums1[k++]=nums1[i++];
                nums1[k++]=nums2[j++];
            }
        }
        while(i<m){
            nums1[k++]=nums1[i++];
        }
        while(j<n){
            nums1[k++]=nums2[j++];
        }
        return nums1;
    }
}

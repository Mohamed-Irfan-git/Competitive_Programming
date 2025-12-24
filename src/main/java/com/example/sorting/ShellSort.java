package com.example.sorting;


import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int [] nums1 = {-5, -2, 4, 5, 0, 0, 0};
        int [] nums2 = {-3, 1, 8};
        int m = 4;
        int n = 3;

        shellSort(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));


    }

    static void shellSort(int[] nums1,int m , int [] nums2,int n) {
        int len = m + n;
        int gap = (len /2) + (len %2);

        while (gap > 0) {
            int left = 0;
            for (int right = gap; right < len; right++) {
                if(right >= m  &&  left < m){
                    if(nums1[left] > nums2[right-m]){
                        int temp = nums1[left];
                        nums1[left] = nums2[right-m];
                        nums2[right-m] = temp;
                    }
                }

                else if(left >= m && right >= m){
                    if(nums2[left-m] > nums2[right-m]){
                        int temp = nums2[left-m];
                        nums2[left-m] = nums2[right-m];
                        nums2[right-m] = temp;
                    }

                }
                else {
                    if(nums1[left] > nums1[right]){
                        int temp = nums1[left];
                        nums1[left] = nums1[right];
                        nums1[right] = temp;
                    }

                }

                left ++;
            }

            if(gap == 1)break;
            gap = (gap/2) + (gap%2);
        }

        for(int i = m ; i < len; i++){
            nums1[i] = nums2[i-m];
        }

    }
}

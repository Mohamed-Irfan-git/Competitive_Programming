package com.example.sliding_window;

public class MinimumPointObtain {
    public static void main(String[] args) {
        int [] arr = {2,4,5,3,1,5};
        int k = 4;
        System.out.println(obtain(arr,k));
    }

    public static int obtain(int [] arr, int n){
        int mxaSum =0;
        int rightSum = 0;
        int leftSum = 0;

        for(int i=0;i<n;i++){
            leftSum+=arr[i];
        }
        mxaSum = leftSum;
        int rightIndex = arr.length-1;
        for(int i=n-1;i>0;i--){
            leftSum-=arr[i];
            rightSum+=arr[rightIndex];
            rightIndex--;

            mxaSum = Math.max(mxaSum,leftSum+rightSum);
        }
        return mxaSum;
    }
}

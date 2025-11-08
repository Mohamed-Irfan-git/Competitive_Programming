package com.example.search;

import java.util.Arrays;

public class BookAllocation {
    public static void main(String[] args) {
        int student = 4;
        int [] books = {24,46,25,30,49};

        System.out.println(minPage1(books,student));
    }

    static int minPage(int [] arr,int k){

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();


        if(k==1){
            return high;
        }


        while(low<high){
            if(stdCount(arr,low)==k){
                return low;
            }
            low++;

        }
        return -1;

    }


    static int minPage1(int [] arr,int k){

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();


        if(k==1){
            return high;
        }
        if(k> arr.length){
            return -1;
        }


        while(low<=high){
            int mid = low+(high-low)/2;
            if(stdCount(arr,mid)<=k){
                high = mid-1;
            }else {
                low = mid+1;
            }


        }
        return low;


    }
    static int stdCount(int [] arr,int low){
        int count = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {
            if(pages+arr[i] <= low){
                pages = arr[i]+pages;
            }
            else{
                count = count + 1;
                pages = arr[i];
            }
        }
        return count;

    }

}

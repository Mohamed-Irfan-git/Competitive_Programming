package com.example.binary_search;

import java.util.Arrays;

public class AllocateBooks {
    public static void main(String[] args) {
        int [] arr = {12, 34, 67, 90};
        int st = 2;
        System.out.println(allocationBooks(arr,st));

    }
    static int allocationBooks(int[] pages,int student){
        int low = Arrays.stream(pages).max().getAsInt();
        int high = Arrays.stream(pages).sum();
        System.out.println(high);

        while(low<=high){
            int mid = (low+high)/2;
            if(isPossibleAllocation(pages,mid,student)){
                low = mid+1;
            }
            else{
                high = mid-1;
            }

        }
        return low;
    }

    static boolean isPossibleAllocation(int[] pages,int maxPage,int student){
        int numOfStudents=1;
        int totalPage = 0;

        for(int i=0;i<pages.length;i++){

            if(totalPage+ pages[i] <= maxPage){
                totalPage += pages[i];
            }
            else{
                numOfStudents++;
                totalPage = pages[i];
            }
        }
        return numOfStudents >student;




    }
}

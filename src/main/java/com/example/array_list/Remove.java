package com.example.array_list;

import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        int [] arr = {10,15,10,20,20,30,30};
        System.out.println(Arrays.toString(removeDup(arr)));
    }
    public static int [] removeDup(int [] arr){
        if(arr.length==0 || arr.length==1){
            return arr;
        }

        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(removeSerach(arr[i],arr1)){
                arr1[i]=arr[i];
            }

        }
        return arr1;


    }
    public static boolean removeSerach(int n,int [] arr){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]==n){
                return false;
            }

        }
        return true;
    }

}

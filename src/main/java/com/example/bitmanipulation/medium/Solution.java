package com.example.bitmanipulation.medium;

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int [] img : image){
            int start=0;
            int end = img.length-1;

            while(start<=end){
                int temp = img[start]^1;
                img[start]=img[end]^1;
                img[end] = temp;
                start++;
                end--;
            }
        }

        return image;
        
    }
}
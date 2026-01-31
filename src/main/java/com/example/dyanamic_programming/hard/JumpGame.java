package com.example.dyanamic_programming.hard;

public class JumpGame {
    public static void main(String[] args) {
        int [] jumps = {1,1,1,1};
        int index = 0;

        System.out.println(isPossibleNoJump(jumps,index,0));
    }
    static boolean isPossibleJump(int[] jumps,int index){
        if(index == jumps.length-1){
            return true;
        }

        boolean flag = false;
        for(int i = 1; i<=jumps[index];i++){
           if((jumps.length-index)>=i){
               flag = isPossibleJump(jumps,index+i);
           }
        }

        return flag;
    }

    static int isPossibleNoJump(int[] jumps,int index,int min){
        if(index == jumps.length-1){
            return min;
        }

        int mini = Integer.MAX_VALUE;
        for(int i = 1; i<=jumps[index];i++){
            if((jumps.length-index)>=i){
                int val = isPossibleNoJump(jumps,index+i,min+1);
                mini= Math.min(val,mini);
            }
        }

        return mini;


    }
}

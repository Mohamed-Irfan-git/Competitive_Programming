package com.example.dyanamic_programming.hard;

public class NinjasTraining {
    public static void main(String[] args) {
        int [][] arr = {
                {70,40,10},
                {180,20,5},
                {20,60,30}
        };

        int day = 2;
        int last = 3;


        System.out.println(training(day,last,arr));

    }
    static int training(int day , int last , int [][] arr){
        if(day==0){
            int maxi = 0;
            for(int i=0;i<arr[0].length;i++){
                if(last != i){
                    int pont = arr[0][i];
                    maxi = Math.max(maxi,pont);
                }
            }
            return maxi;
        }



        int points = 0;
        for(int task=0; task< 3; task++){
            if(task != last ){
                int point = training(day-1,task,arr)+ arr[day][task];
                points = Math.max(points,point);
            }
        }

        return points;
    }
}

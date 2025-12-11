package com.example.pattern;

public class Pattern1 {
    public static void main(String[] args) {
        pattern1(4);

    }

    static void pattern1(int n){
        for(int i=0 ; i<(2*n)-1;i++){

            for (int j=0 ; j<(2*n)-1;j++){

                int top = i;
                int left = j;

                int bottom = (2*n-2) -i;
                int right = (2*n-2) -j;

                int minDis = Math.min(Math.min(left,right),Math.min(top,bottom));

                System.out.print(n-minDis+" ");
            }
            System.out.println();

        }

    }
}

package com.example.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
//        subSeq("","abc");
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(9);
        a.add(2);
        a.add(5);
        a.add(1);


        int count = subSeq1(a,10,new ArrayList<>());
        System.out.println(count);
    }
    static void subSeq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));
    }

    static List<String> subSeqRet(String p,String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> left = subSeqRet(p+ch,up.substring(1));
        List<String> right = subSeqRet(p,up.substring(1));

        left.addAll(right);
        return left;

    }

    static int subSeq1(ArrayList<Integer> p,int k,ArrayList<Integer> up){
        int count = 0;
        if(p.isEmpty()){
            int sum = 0;
            for(Integer i:up){
                sum+=i;
            }
            if(sum==k){
                count++;
            }
            return count;
        }

        count += subSeq1(p,k,up);

        int adding = p.get(0);
        p.remove(0);
        up.add(adding);

        count += subSeq1(p,k,up);

        return count;

    }


}

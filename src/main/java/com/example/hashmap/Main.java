package com.example.hashmap;

public class Main {
    public static void main(String[] args) throws Exception {
        HashM<Integer> hashM = new HashM<>();
        hashM.insert(18);
        hashM.insert(12);
        hashM.insert(19);
        hashM.insert(16);
        hashM.insert(15);

        System.out.println(hashM.heapSort());

    }
}

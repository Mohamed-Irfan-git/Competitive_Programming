package com.example.heap;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(18);
        heap.insert(12);
        heap.insert(19);
        heap.insert(16);
        heap.insert(15);

        System.out.println(heap.displayAll());
        System.out.println(heap.heapSort());

    }
}

package com.example.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueMethods {
    public static void main(String[] args) {
        // min head
        PriorityQueue <Integer> queue = new PriorityQueue<>();
        // max heap
        PriorityQueue <Integer> queue1 = new PriorityQueue<>(Collections.reverseOrder());

        queue.add(10);
        System.out.println(queue.peek()); // accessing first element of the queue
        queue.poll();
        System.out.println(queue);
//        queue.size();
//        queue.remove(10);
//

    }
}

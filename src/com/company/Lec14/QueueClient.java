package com.company.Lec14;

public class QueueClient {

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue();

        for (int i = 0; i <=5 ; i++) {
            queue.insert(i);
        }
        System.out.println(queue.remove());

        queue.insert(8);
        System.out.println(queue.remove());

    }
}

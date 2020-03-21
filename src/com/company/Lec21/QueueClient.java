package com.company.Lec21;

import com.company.Lec14.CircularQueue;

public class QueueClient {

    public static void main(String[] args) {

      DynamicQueue queue = new DynamicQueue();

        for (int i = 0; i <=50 ; i++) {
            queue.insert(i);
        }
//
//        for (int i = 0; i <=50 ; i++) {
//            System.out.println(queue.remove());
//
//        }

        queue.display();
    }
}

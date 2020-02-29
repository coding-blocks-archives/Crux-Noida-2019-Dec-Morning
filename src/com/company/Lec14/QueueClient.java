package com.company.Lec14;

public class QueueClient {

    public static void main(String[] args) {

        Queue queue = new Queue();

        for (int i = 0; i <=5 ; i++) {
            queue.insert(i);
            queue.display();
        }

        for (int i = 0; i <=5 ; i++) {
            System.out.println(queue.remove());
            queue.display();
        }
    }
}

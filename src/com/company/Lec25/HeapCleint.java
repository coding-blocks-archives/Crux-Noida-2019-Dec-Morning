package com.company.Lec25;

public class HeapCleint {

    public static void main(String[] args) throws Exception {

        Heap heap =new Heap();
        heap.insert(12);
        heap.insert(4);
        heap.insert(2);
        heap.insert(1);

        for (int i = 0; i <4 ; i++) {
            System.out.println(heap.remove());
        }
        heap.display();
    }
}

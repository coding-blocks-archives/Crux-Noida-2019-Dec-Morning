package com.company.Lec21;

public class DynamicQueue extends CircularQueue {

    @Override
    public void insert(int value) {
        if(isFull()){

            int[] ar = new int[2*data.length];

            for (int i = 0; i <size ; i++) {

                ar[i]= data[(front+i)%data.length];
            }

            front=0;
            end=data.length;
            data=ar;
        }
        super.insert(value);
    }
}

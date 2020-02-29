package com.company.Lec14;

public class OptimizedQueue {

    private int data[];
    private int end;
    private int front;
    private int DEFAULT_SIZE=10;

    public OptimizedQueue(){
        this.data=new int[DEFAULT_SIZE];
        this.end=0;
        this.front=0;
    }

    public void insert(int value){
        if(isFull()){
            return;
        }

        data[end++]=value;
    }

    private boolean isFull() {
        return end==data.length;
    }

    public int remove(){

        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }

        int temp=data[front];
//
//        for (int i = 1; i <end ; i++) {
//            data[i-1]=data[i];
//        }
        front++;
        return temp;
    }

    private boolean isEmpty() {
        return end==front;
    }

    public int front(){
        return data[0];
    }

    public void display(){
        for (int i = front; i <end ; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

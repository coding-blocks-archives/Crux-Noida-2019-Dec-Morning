package com.company.Lec14;

public class Queue {

    private int data[];
    private int end;
    private int DEFAULT_SIZE=10;

    public Queue(){
        this.data=new int[DEFAULT_SIZE];
        this.end=0;
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

        int temp=data[0];

        for (int i = 1; i <end ; i++) {
            data[i-1]=data[i];
        }
        end--;
        return temp;
    }

    private boolean isEmpty() {
        return end==0;
    }

    public int front(){
        return data[0];
    }

    public void display(){
        for (int i = 0; i <end ; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

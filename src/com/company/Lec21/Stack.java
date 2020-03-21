package com.company.Lec21;

public class Stack {
    protected int data[];
    private int top;
    private int DEFAULT_SIZE=10;

    public Stack(){
        this.data= new int[DEFAULT_SIZE];
        this.top=-1;
    }

    public void push(int element){

        if(isfull()){
            System.out.println("Bhara hun");
            return;
        }

        data[++top]=element;
    }

    protected boolean isfull() {
        return top==data.length-1;
    }

    public int pop() throws Exception{

        if (isEmpty()){
            throw new Exception("khaali he be");
        }

        int temp= data[top];
        top--;
        return temp;
    }

    private boolean isEmpty() {
        return top==-1;
    }

}

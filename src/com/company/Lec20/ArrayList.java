package com.company.Lec20;

public class ArrayList {

    private int ar[];
    int DEFAULT_SIZE=10;
    int size;

    public ArrayList() {
        this.ar = new int[DEFAULT_SIZE];
        this.size=0;
    }


    public boolean isfull(){
        return size==ar.length;
    }


    public void add(int element){

        if(isfull()){
            resize();
        }
        ar[size++]=element;
    }

    private void resize() {

        int data[] =new int[2*ar.length];

        for (int i = 0; i <ar.length ; i++) {
            data[i]=ar[i];

        }
        ar=data;
    }

    public void set(int index, int element){

        ar[index]=element;
    }

    public int remove(){


        int temp= ar[size-1];

        size--;

        return temp;
    }

    public int get(int index){
        return ar[index];
    }

    public int size(){
        return size;
    }

    public void display(){
        for (int i = 0; i <size ; i++) {
            System.out.println(ar[i]);
        }
    }
}

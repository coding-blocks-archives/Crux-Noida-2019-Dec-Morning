package com.company.Lec25;

import java.util.ArrayList;

public class Heap {

    ArrayList<Integer> list = new ArrayList<>();

    public void insert(int value){
        list.add(value);
        upheap(list.size()-1);
    }

    private void upheap(int index) {

        if(index==0){
            return;
        }

        int p = parent(index);

        if(list.get(p)>list.get(index)){
            swap(p,index);
            upheap(p);
        }
    }

    public void swap(int p, int index){

        int temp= list.get(p);
        list.set(p,list.get(index));
        list.set(index,temp);
    }

    public int remove() throws Exception{

        if(list.isEmpty()){
            throw new Exception("khaali he");
        }

        int temp= list.get(0);
        int last= list.remove(list.size()-1);

        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }

        return temp;
    }

    private void downheap(int index) {

        int min=index;

        int left= leftchild(index);
        int right =rightchild(index);

        if (left<list.size() && list.get(min)>list.get(left)){
            min=left;
        }

        if(right<list.size() && list.get(min)>list.get(right)){
            min=right;
        }

        if(min!=index){
         swap(min,index);
         downheap(min);
        }
    }


    public int parent(int index){
        return (index-1)/2;
    }

    public int leftchild(int index){
        return (2*index)+1;
    }

    public int rightchild(int index){
        return (2*index)+2;
    }

    public void display(){
        System.out.println(list);
    }
}

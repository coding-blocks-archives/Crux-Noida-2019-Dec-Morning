package com.company.Lec8;

public class ArrayRec {

    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};

        System.out.println(linear(ar,3,0));
    }

    public static int linear(int ar[], int element, int index){

        if(ar.length==index){
            return -1;
        }

        if(ar[index]==element){
            return index;
        }

        return linear(ar,element,index+1);
    }
}

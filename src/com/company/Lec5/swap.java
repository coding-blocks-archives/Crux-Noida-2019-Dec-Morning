package com.company.Lec5;

public class swap {

    public static void main(String[] args) {

        int ar[]= {1,2,3,4,5};


        System.out.println(ar[0]+ " "+ ar[1]);
        swap(ar);
        System.out.println(ar[0]+ " "+ ar[1]);
    }

    public static void swap(int ar[]){

        int t=ar[0];
        ar[0]=ar[1];
        ar[1]=t;
    }

}

package com.company.Lec7;

// REVERSAL ALGORITHM

import com.company.Lec5.Util;

import java.util.Arrays;

public class Rotation {

    public static void main(String[] args) {

        int ar[]= {1,2,3,4,5};
        int k=2;

        reverse(ar,0,k-1);
        System.out.println(Arrays.toString(ar));
        reverse(ar,k,ar.length-1);
        System.out.println(Arrays.toString(ar));
        reverse(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }

    public static void reverse(int ar[], int start ,int end){

        while(start<=end){
            Util.swap(ar,start,end);
            start=start+1;
            end=end-1;
        }

    }

}

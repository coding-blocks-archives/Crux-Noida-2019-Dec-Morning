package com.company.Lec9;

import com.company.Lec5.Util;

import java.util.Arrays;

public class RecEg {

    public static void main(String[] args) {

        int ar[]= {5,4,3,2,1};
        bubble(ar, ar.length-1,0);
        System.out.println(Arrays.toString(ar));
    }

    public static void bubble(int ar[], int row, int col){

        if(row==0){
            return;
        }

        if(row==col){
            bubble(ar,row-1,0);
            return;
        }

        if(ar[col]>ar[col+1]){
            Util.swap(ar,col,col+1);
        }

        bubble(ar,row,col+1);
    }


}

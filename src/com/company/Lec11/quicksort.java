package com.company.Lec11;

import com.company.Lec5.Util;

import java.util.Arrays;

public class quicksort {

    public static void main(String[] args) {
        int ar[]={1,4,7,5,6};
        quicksort(ar,0,ar.length);

        System.out.println(Arrays.toString(ar));
    }

    public static void quicksort(int ar[],int start,int end){

        if(end<=start){
            return;
        }

        int pivot=end-1;

        pivot=pivotchange(ar,start,pivot);

        quicksort(ar,start,pivot);
        quicksort(ar,pivot+1,end);

    }

    public static int pivotchange(int ar[],int start,int pivot){

        int j=start;
        for (int i = start; i <pivot ; i++) {

            if(ar[i]<ar[pivot]){
                Util.swap(ar,i,j);
                j++;
            }
        }

        Util.swap(ar,pivot,j);
        return j;
    }
}

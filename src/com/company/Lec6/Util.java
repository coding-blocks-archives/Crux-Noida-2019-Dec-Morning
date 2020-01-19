package com.company.Lec6;

public class Util {

    public static void swap(int ar[], int i, int j){
        int t= ar[i];
        ar[i]=ar[j];
        ar[j]=t;
    }

    public static int maxindex(int ar[],int start, int end){

        int max=start;
        for (int i = start; i <=end ; i++) {

            if( ar[i]>ar[max]){
                max=i;
            }
        }

        return max;

    }
}

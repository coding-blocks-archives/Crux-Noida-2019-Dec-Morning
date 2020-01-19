package com.company.Lec5;

public class Searching {

    public static void main(String[] args) {
        int ar[] ={1,2,3,4,5};

        System.out.println(binary(ar,5));
    }

    public static int linear(int ar[], int element){

        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]==element){
                return i;
            }
        }
        return -1;
    }


    public static int binary(int ar[],int element){
        int start=0;
        int end = ar.length-1;

        while(start<=end){

            int mid= (start+end)/2;

            if(ar[mid]==element){
                return mid;
            }

            else if(element>ar[mid]){
                start=mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;
    }
}

package com.company.Lec5;

import java.util.Scanner;

public class Examples {

    public static void main(String[] args) {

//        int ar[]=  new int[5];

//        Scanner s= new Scanner(System.in);
//
//        for (int i = 0; i < ar.length; i++) {
//            ar[i] = s.nextInt();
//        }
//
//        int sum=0;
//
//        for (int i = 0; i <ar.length ; i++) {
//            sum=sum+ar[i];
//        }
//
//        System.out.println(sum);

        int ar[] ={1,2,5,4,3};

        System.out.println(max(ar));

    }


    public static int max(int ar[]){

        int max=ar[0];
        for (int i =1; i <ar.length ; i++) {

                     if( ar[i]>max){
                         max=ar[i];
                     }
        }

        return max;

    }
}

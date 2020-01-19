package com.company.Lec6;

import java.util.Scanner;

public class MultiEg {

    public static void main(String[] args) {

        int[][] ar= new int[3][3];

        Scanner s= new Scanner(System.in);

//        for (int i = 0; i <ar.length ; i++) {
//
//            for (int j = 0; j <ar[i].length ; j++) {
//
//                System.out.println(ar[i][j]);
//            }
//        }
//
//
//        for (int i = 0; i <ar.length ; i++) {
//
//            for (int j = 0; j <ar[i].length ; j++) {
//
//                ar[i][j]=s.nextInt();
//            }
//        }

        int ar1[][]= {{1,2,3},{4,5,6},{7,8,9}};
        wave(ar1);
    }

    public static void wave(int ar[][]){


        for (int i = 0; i <ar.length ; i++) {

            if (i % 2 == 0) {

                for (int j = 0; j <ar[i].length; j++) {
                    System.out.println(ar[i][j]);
                }
            }

            else{

                for (int j = ar[i].length-1; j>=0; j--) {
                    System.out.println(ar[i][j]);
                }
            }
        }
    }
}



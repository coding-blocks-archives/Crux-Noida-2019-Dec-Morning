package com.company.Lec3;

import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        n=n/2+1;
        int k=1;
        int row=1;

        while(k<=2*n-1){

            int col=1;
            int sidemirror=1;
            while (sidemirror<=2*n-1){

                if(col<=row){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }

                if(sidemirror<n){
                    col=col+1;
                }
                else{
                    col=col-1;
                }

                sidemirror=sidemirror+1;
            }


            System.out.println();
            if(k<n){
                row=row+1;
            }
            else{
                row=row-1;
            }

            k=k+1;

        }
    }
}

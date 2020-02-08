package com.company.Lec8;

public class Recursioneg {

    public static void main(String[] args) {
        pdboth(4);
    }

    public static void pdboth(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        pdboth(n-1);
        System.out.println(n);
    }

    public static int fact(int n){

        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static int fibo(int n){
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
}

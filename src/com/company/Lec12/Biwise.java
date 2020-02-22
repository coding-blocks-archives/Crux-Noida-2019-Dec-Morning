package com.company.Lec12;

public class Biwise {

    public static void main(String[] args) {

        System.out.println(setcountbits(5));
    }

    public static void oddeven(int n){

        if((n&1)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }

    public static void swap(int a, int b){

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a+ " "+ b);
    }

    public static int setcountbits(int n){

        int cnt=0;

        while(n!=0){

            if((n&1)==1){
                cnt++;
            }

            n=n>>1;
        }
        return cnt;
    }
}

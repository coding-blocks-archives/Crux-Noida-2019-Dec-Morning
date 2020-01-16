package com.company.Lec4;

public class Converter {


    public static void main(String[] args) {
        System.out.println(bintodec(1011));
        System.out.println(dectobin(11));
        System.out.println(anytodec(750,8));
    }

    public static int bintodec(int bin){

        int place=1;
        int deci=0;

        while(bin>0){

            int digit = bin % 10;
            bin=bin/10;
            deci= deci+ digit*place;
            place=place*2;
        }
        return deci;
    }

    public static int anytodec(int any, int base){

        int place=1;
        int deci=0;

        while(any>0){

            int digit = any % 10;
            any=any/10;
            deci= deci+ digit*place;
            place=place*base;
        }
        return deci;
    }

    public static int dectobin(int deci){

        int place=1;
        int bin=0;

        while(deci>0){

            int digit = deci % 2;
            deci=deci/2;
            bin= bin+ digit*place;
            place=place*10;
        }
        return bin;
    }
}

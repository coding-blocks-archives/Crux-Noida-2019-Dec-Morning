package com.company.Lec3;

import java.util.Scanner;

public class sal {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        int sal= s.nextInt();

        if(sal>5000){
            sal=sal+3000;
        }
        else{
            sal=sal+200;
        }

        System.out.println(sal);
    }
}

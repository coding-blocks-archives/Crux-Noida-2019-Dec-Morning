package com.company.Lec29;

import java.util.Scanner;

public class DiceCount {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int[] mem = new int[n+1];
//        System.out.println(diceDpRec(n,mem));
//
//        System.out.println(dice(7));

        System.out.println(DiceDPItr(n,mem));
    }

    public static int diceDpRec(int target, int[] mem) {

        if(target==0){
            return 1;
        }

        if(mem[target]!=0){
            return mem[target];
        }

        int cnt =0;
        for (int i = 1; i <=6 && i<=target ; i++) {

            cnt +=  diceDpRec(target-i,mem);
        }
        mem[target]= cnt;

        return mem[target];

    }

    public static int dice(int target){

        if(target==0){
            return 1;
        }

        int cnt=0;

        for (int i = 1; i <=6 && i<=target ; i++) {

         cnt+=  dice(target-i);
        }

       return cnt;
    }

    public static int DiceDPItr(int target ,int mem[]){

        mem[0]=1;

        for (int i = 1; i <=target ; i++) {

            for (int j = 1; j <=i && j<=6; j++) {

                mem[i] =mem[i]+mem[i-j];
            }
        }
        return mem[target];
    }


}

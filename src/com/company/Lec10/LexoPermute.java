package com.company.Lec10;

import java.util.Arrays;

public class LexoPermute {

    public static void main(String[] args) {

        String str="abc";
        int fre[]=frequency(str);
        System.out.println(Arrays.toString(fre));

        permute("",fre,str.length());
    }

    public static void permute(String processed, int freq[], int length){

        if(length==0){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i <freq.length ; i++) {

            if(freq[i]>0){

                freq[i]--;
                permute(processed+ (char)(i+'a'),freq,length-1);
                freq[i]++;
            }
        }
    }

    public static int[] frequency(String str){

        int ar[] = new int[26];
        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            ar[ch-'a']++;
        }
        return ar;
    }
}

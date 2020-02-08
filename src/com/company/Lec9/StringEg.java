package com.company.Lec9;

public class StringEg {

    public static void main(String[] args) {

        subseq("","abc");

        skipi("","hihi");
    }


    public static void subseq(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch= unprocessed.charAt(0);
        unprocessed= unprocessed.substring(1);

        subseq(processed+ch,unprocessed);
        subseq(processed,unprocessed);
    }

    public static void skipi(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch=  unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        if(ch!='i'){
            skipi(processed+ch,unprocessed);
            return;
        }

        skipi(processed,unprocessed);
    }



    public static void dice(String processed,int target){

        if(target==0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <=target && i<=6 ; i++) {

            dice(processed+i,target-i);
        }
    }

    public static void permutation(String processed, String unprocessed){

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch=  unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);


        for (int i = 0; i <=processed.length() ; i++) {


            String first= processed.substring(0,i);
            String second= processed.substring(i);

            permutation(first+ch+second,unprocessed);
        }
    }

}

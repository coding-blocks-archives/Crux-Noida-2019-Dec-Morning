package com.company.Lec7;

public class IntroString {

    public static void main(String[] args) {

//        String s= new String("hello");
        String s= "hello";


        locations(s,'l');
//        String p= "hello";

//        System.out.println(s==p);
//        System.out.println(s.equals(p));
//        System.out.println(s.length());
//
//        System.out.println(s.substring(1));
//        System.out.println(s.substring(3,5));
//
//        System.out.println(s.charAt(0));
//
//        System.out.println(s.indexOf("l",3));
        substring(s);


    }

    public static void locations(String str, char ch){

        int index=0;

        while(true){

            index= str.indexOf(ch,index);

            if(index==-1){
                break;
            }

            System.out.println(index);
            index=index+1;
        }
    }

    public static void substring(String str){

        for (int i = 0; i <str.length() ; i++) {

            for (int j = i+1; j <=str.length() ; j++) {

                System.out.println(str.substring(i,j));
            }
        }
    }

    public static boolean ispallin(String str){

        int start=0;
        int end=str.length()-1;

        while(start<=end){

            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }



}

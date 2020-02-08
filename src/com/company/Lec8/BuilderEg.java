package com.company.Lec8;

public class BuilderEg {

    public static void main(String[] args) {

        String s= "";

        StringBuilder builder = new StringBuilder(s);

        for (int i = 0; i <1000000 ; i++) {

            builder.append('a');
        }

        builder.reverse();

        int b= 'c'-'a';
        System.out.println(b);

        System.out.println(builder);

        System.out.println(toggle("hello"));
    }

    public static String toggle(String str){

        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z'){

                ch= (char)('a'+(ch-'A'));
            }

            else{
                ch=  (char)('A'+(ch-'a'));
            }

            builder.setCharAt(i,ch);
        }

        return builder.toString();
    }
}

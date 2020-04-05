package com.company.Lec26;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;

public class Hashmapeg {

    public static void main(String[] args) {

        HashMap<String,String> map =new HashMap<>();
        map.put("Apple", "THEEK");
        map.put("Orange", "Bahut bekaar");
        map.put("Mango", "Bahut ganda");

        System.out.println(map);

        for (String string:map.keySet()) {
            System.out.println(string);
        }

        for (String string:map.values()){
            System.out.println(string);
        }

        map.remove("Apple");

        for (String string:map.keySet()) {
            System.out.println(string);
        }

        System.out.println(frequency("abaa"));
    }

    public static HashMap<Character,Integer> frequency(String str){

        HashMap<Character,Integer> map= new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        return map;
    }

}

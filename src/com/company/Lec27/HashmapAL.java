package com.company.Lec27;

public class HashmapAL {


    public static void main(String[] args) {

        HashmapusingAL map = new HashmapusingAL();

        map.put("apple","Theek");
        map.put("mango","bekaar");
        map.put("orange","bahut bekaaar");
        map.put("banana", "Mast");

        map.remove("apple");

        System.out.println(map.get("apple"));
        System.out.println(map.get("mango"));
        System.out.println(map.get("orange"));
        System.out.println(map.get("banana"));
    }

}

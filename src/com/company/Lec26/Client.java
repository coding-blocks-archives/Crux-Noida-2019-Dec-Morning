package com.company.Lec26;

public class Client {

    public static void main(String[] args) {

        HashMapLL map = new HashMapLL();

        map.put("Apple", "THEEK");
        map.put("Orange", "Bahut bekaar");
        map.put("Mango", "Bahut ganda");

        System.out.println(map.get("Orange"));

        map.remove("Orange");
        System.out.println(map.get("Orange"));

        System.out.println(map);
    }
}

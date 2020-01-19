package com.company.Lec6;

import java.util.ArrayList;

public class Listeg {

    public static void main(String[] args) {


        ArrayList list =  new ArrayList();
        list.add(8);
        list.add(9);
        list.add(19);
        list.add(99);

        list.size();


        System.out.println(list.remove(0));
        System.out.println(list.get(0));

        System.out.println(list);
    }
}

package com.company.Lec14;

public class Child {

    public static void main(String[] args) {

        Human human=new Human(5000000);

        human.loan();
        System.out.println(human.salary);
    }
}

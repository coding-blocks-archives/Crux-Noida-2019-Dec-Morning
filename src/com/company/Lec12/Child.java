package com.company.Lec12;

public class Child {

    public static void main(String[] args) {

        Human santosh= new Human();
        System.out.println(santosh.name);
        santosh.name="Ironman";
        System.out.println(santosh.name);

      santosh.loan();

      Human rahul= new Human();
      rahul.name= "Cheeku";

        System.out.println(rahul.salary);
    }
}


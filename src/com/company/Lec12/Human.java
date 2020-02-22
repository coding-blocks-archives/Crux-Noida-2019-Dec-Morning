package com.company.Lec12;

public class Human {

    String name;

    int salary= 5000000;


    public void loan(){

        int t= salary/10;

        salary=salary-t;

        System.out.println("gareeb ho gya " + salary);
    }

    public static void fest(){
        System.out.println("hurra hurra");
//
//        lunch();
    }

    public void lunch(){
        if(salary<3500000){
            System.out.println("me nhi khilaunga");
            return;
        }

        salary=salary-2000000;

    }


}

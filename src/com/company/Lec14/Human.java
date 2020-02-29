package com.company.Lec14;

public class Human {


    String name;
    int salary=10000;

    public Human(){
       this(20000);
    }

    public Human(int salary){
        this(salary,"anonymous rawat");

    }

    public Human(int salary, String name){

        this.salary=salary;
        this.name=name;

    }

    public void loan(){
        int temp=salary/10;
        salary=salary-temp;

        System.out.println("me gareeb ho gaya"+ salary);
    }

    public static void fest(){
        System.out.println("hurra hurra");
    }

    public void eat(){

        if(salary<2000000){
            System.out.println("Bhaag yaha se");
            return;
        }
        salary=salary-500000;
    }
}

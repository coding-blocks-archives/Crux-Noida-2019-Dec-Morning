package com.company.Lec8;

public class LearningRec {

    public static void main(String[] args) {
        pd4();
    }

    public static void pd4(){
        System.out.println(4);
        pd3();
    }
    public static void pd3(){
        System.out.println(3);
        pd2();
        System.out.println("jaa rhahun no. 3");
    }
    public static void pd2(){
        System.out.println(2);
        pd1();
        System.out.println("jaa rha hun no2");
    }
    public static void pd1(){
        System.out.println(1);
        pd0();
    }

    private static void pd0() {
        return;
    }
}

package com.company.Lec20;

public class Client {
    public static void main(String[] args) {

//        Engine engine=new Engine();
//        PetrolEngine engine = new PetrolEngine();

        Engine engine1=new Engine();
        System.out.println(engine1.speed);

//        add(1,2,2,3,4,45,45,6,6,7,7,88,8,8,8,8,89,98,78,56);
    }

    public static void add(int ...ar){

        int sum =0;

        for (int i = 0; i <ar.length; i++) {
            sum=sum+ar[i];
        }

        System.out.println(sum);
    }
}

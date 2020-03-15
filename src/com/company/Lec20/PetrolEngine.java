package com.company.Lec20;

public class PetrolEngine extends Engine {

    int speed =4;

//    @Override
//    public void gear() {
//        System.out.println("hi");
//    }

    public void start(){
        System.out.println(super.speed);
    }

    public void stop(){
        System.out.println("i stop like a petrol engine");
    }

    public void nitro(){
        System.out.println("boost");
    }

}

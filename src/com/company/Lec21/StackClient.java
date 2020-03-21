package com.company.Lec21;

public class StackClient {

    public static void main (String[] args){
        DynamicStack stack = new DynamicStack();

        for (int i = 0; i <14 ; i++) {
            stack.push(i);
        }


        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

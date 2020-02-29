package com.company.Lec14;

public class StackClient {

    public static void main (String[] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


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

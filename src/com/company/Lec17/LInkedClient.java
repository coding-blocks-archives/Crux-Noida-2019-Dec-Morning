package com.company.Lec17;

public class LInkedClient {

    public static void main(String[] args) {

        LinkedList list1= new LinkedList();
        LinkedList list2= new LinkedList();
//        list.insertfirst(1);
//        list.insertfirst(2);
//        list.insertfirst(3);
        list1.insertlast(1);
        list1.insertlast(8);
        list1.insertlast(9);
        list2.insertlast(4);
        list2.insertlast(5);
        list2.insertlast(6);

        LinkedList list =new LinkedList();

        LinkedList list3= list.merge(list1,list2);
        list3.display();


//        System.out.println(list.deletefirst());
//
//        System.out.println(list.deletelast());
//
//        list.insertbetween(2,55);


//       list.reverse();
////        list.display();
////
////        System.out.println(list.deleteatindex(0));
//
//        list.display();

    }
}

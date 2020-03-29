package com.company.Lec24;

public class BSTclient {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);

        System.out.println(tree.isbalanced());
//
//        int in[] ={1,3,4,5,7};
//        int pre[] ={5,3,1,4,7};
//        tree.makefromsorted(ar,0,ar.length-1);

//        tree.makefromprein(pre,in);
//        tree.display();


//        tree.display();
//        System.out.println(tree.successor(0));
//        System.out.println(tree.height());
//        tree.inrange(3,6);
//        System.out.println(tree.successor(1));


    }
}

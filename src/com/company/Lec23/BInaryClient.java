package com.company.Lec23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BInaryClient {

    public static void main(String[] args) throws FileNotFoundException {

        File file= new File("input");

        Scanner s = new Scanner(file);
        BInaryTree tree = new BInaryTree();

        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);


//        System.out.println(tree.height());

//        System.out.println(tree.find(9));
//        tree.levelorder();
        tree.Atlevel(2);

    }
}

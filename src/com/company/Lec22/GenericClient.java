package com.company.Lec22;

import java.util.Scanner;

public class GenericClient {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        GenericTrees tree = new GenericTrees();

        tree.insert(s);

//

        tree.levelorder();
        tree.Atlevel(1);
    }

}

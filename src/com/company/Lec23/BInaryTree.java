package com.company.Lec23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BInaryTree {

    private Node root;

    public void insert(Scanner s){
        this.root= insert(root,s);
    }

    private Node insert(Node node, Scanner s) {

        if(node==null){
            System.out.println("Enter the value");
            int val= Integer.parseInt(s.nextLine());
            return new Node(val);
        }

        System.out.println("Enter the direction");
        String dir =s.nextLine();

        if(dir.equals("left")){
            node.left= insert(node.left,s);
        }
        else{
            node.right =insert(node.right,s);
        }

        return node;
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node,String indent){

        if(node==null){
            return;
        }

        System.out.println(indent+node.value);

        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    public void inorder(){
        inorder(root,"");
    }

    private void inorder(Node node,String indent){

        if(node==null){
            return;
        }

        inorder(node.left,indent+"\t");

        System.out.println(indent+node.value);
        inorder(node.right,indent+"\t");

    }


    public void postorder(){
        postorder(root,"");
    }

    private void postorder(Node node,String indent){

        if(node==null){
            return;
        }


        postorder(node.left,indent+"\t");
        postorder(node.right,indent+"\t");

        System.out.println(indent+node.value);

    }


    public int height(){
        return height(root);
    }

    private int height(Node node) {

        if(node==null){
            return 0;
        }

        return Math.max(height(node.left),height(node.right))+1;
    }

    public boolean find(int target){
       return find(root, target);
    }

    private boolean find(Node node, int target){

        if(node==null){
            return false;
        }

        if(node.value==target){
            return true;
        }

        return find(node.left,target)|| find(node.right,target);

    }

    public void levelorder(){

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            Node temp= queue.remove();
            System.out.println(temp.value);

            if(temp.left!=null){
                queue.add(temp.left);
            }

            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }


    public int diameter(){
        return diameter(root);
    }

    private int diameter(Node node) {

        if(node==null){
            return 0;
        }

        int current = 1+ height(node.left) + height(node.right);

        int max= Math.max(diameter(node.left),diameter(node.right));

        return Math.max(current,max);
    }

    public void mirror(){

        mirror(root);
    }

    private void mirror(Node node) {

        if(node==null){
            return;
        }

        Node temp =node.left;
        node.left=node.right;
        node.right=temp;

        mirror(node.left);
        mirror(node.right);
    }


    public void Atlevel(int k){

        Atlevel(root,k);
    }

    private void Atlevel(Node node,int k){

        if(node==null){
            return;
        }

        if(k==0){
            System.out.println(node.value);
        }

        Atlevel(node.left,k-1);
        Atlevel(node.right,k-1);
    }



    //Homework -- > Find the sum at Level

    class Node{

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}

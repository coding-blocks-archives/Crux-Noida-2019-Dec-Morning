package com.company.Lec24;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class GenericBST<T extends Comparable<T>> {


    private Node root;


    public void insert(T key){

        this.root= insert(root,key);
    }

    private Node insert(Node node, T key) {

        if(node==null){
            return new Node(key);
        }

        if (node.value.compareTo(key)>0) {

            node.left= insert(node.left,key);
        }

        else{
            node.right=insert(node.right,key);
        }

//        node.height=Math.max(height(node.left),height(node.right))+1;

        return node;
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent) {

        if(node==null){
            return;
        }

        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    public void inorder(){        //prints in sorted order
        inorder(root,"");
    }

    private void inorder(Node node,String indent) {

        if(node==null){
            return;
        }

        inorder(node.left,indent+"\t");
//        System.out.println(node.value);
        inorder(node.right,indent+"\t");
    }

//    public void inrange(int k1, int k2){
//        inrange(root,k1,k2);
//    }
//
//    public void inrange(Node node, int k1, int k2){
//
//        if(node==null){
//            return;
//        }
//
//        if(node.value>k1 && node.value<k2){
//            System.out.println(node.value);
//        }
//
//        if(node.value>k1){
//            inrange(node.left,k1,k2);
//        }
//
//        if(node.value<k2){
//            inrange(node.right,k1,k2);
//        }
//    }
//
//    public int height(){
//       return height(root);
//    }
//
//    public int height(Node node){
//
//        if(node==null){
//            return 0;
//        }
//
//        return node.height;
//    }
//
//    public void makefromsorted(int ar[], int start, int end){
//
//        if(start>end){
//            return;
//        }
//                                       // Content zyada -----> pace fast
//        int mid = (start+end)/2;
//
//        insert(ar[mid]);
//
//        makefromsorted(ar,start,mid-1);
//        makefromsorted(ar,mid+1,end);
//    }
//
//    public int successor(int k){
//
//        Node success= null;
//
//        Node current =root;
//
//        while(current!=null){
//
//            if(current.value > k){
//
//                if(success == null || success.value>current.value){
//                    success=current;
//                }
//                current=current.left;
//            }
//            else{
//                current = current.right;
//            }
//        }
//
//        return success.value;
//    }
//
//    public void makefromprein(int pre[], int in[]){
//
//        this.root= makefromprein(root, pre, in);
//    }
//
//    private Node makefromprein(Node node, int[] pre, int[] in) {
//
//        if(in.length==0){
//            return node;
//        }
//
//        int ele=pre[0];
//        int index= find(ele,in);
//
//        int[] in_left = Arrays.copyOfRange(in,0,index);
//        int[] in_right=Arrays.copyOfRange(in,index+1,in.length);
//
//        int[] pre_left = Arrays.copyOfRange(pre,1,index+1);
//        int[] pre_right = Arrays.copyOfRange(pre,index+1,pre.length);
//
//        Node node1 =new Node(ele);
//
//        node1.left= makefromprein(node1.left,pre_left,in_left);
//        node1.right=makefromprein(node1.right,pre_right,in_right);
//
//        return node1;
//
//    }
//
//    public boolean isbalanced(){
//        return isbalanced(root);
//    }
//
//    private boolean isbalanced(Node node) {
//
//        if(node==null){
//            return true;
//        }
//
//        int diff= Math.abs(height(node.left)- height(node.right));
//
//        if(diff>1){
//            return false;
//        }
//
//        boolean left = isbalanced(node.left);
//        boolean right= isbalanced(node.right);
//
//        return left && right ;
//    }
//
//    private int find(int ele, int[] in) {
//
//        for (int i = 0; i <in.length ; i++) {
//
//            if(in[i]==ele){
//                return i;
//            }
//        }
//        return -1;
//    }

    class Node{
        T value;
        Node left;
        Node right;
        int height;

        public Node(T value) {
            this.value = value;
            this.height=1;
        }
    }
}

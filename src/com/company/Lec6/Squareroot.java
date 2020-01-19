package com.company.Lec6;

public class Squareroot {

    public static void main(String[] args) {


        System.out.println(root(10));

       // precision part discussed
    }


    public static int root(int n){
        int start=1;
        int end=n;
        int ans=0;

        while(start<=end){
            int mid= (start+end)/2;

            if(mid*mid== n){
                return mid;
            }

            else if(mid*mid>n){
                end=mid-1;
            }

            else{
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
}

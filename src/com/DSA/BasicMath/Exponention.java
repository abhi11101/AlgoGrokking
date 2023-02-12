package com.DSA.BasicMath;

public class Exponention {
    public static void main(String[] args) {
        System.out.println(find(2,4));
    }

    public static int find(int n, int p){
        int res=1;
        while (p>0){
            if ((p&1)!=0){
                res=res*n;
            }
            n=n*n;
            p=p>>1;
        }
        return res;
    }
}

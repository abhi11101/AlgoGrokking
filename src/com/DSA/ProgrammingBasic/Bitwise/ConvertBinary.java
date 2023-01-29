package com.DSA.ProgrammingBasic.Bitwise;

public class ConvertBinary {
    public static void main(String[] args) {
        binary(12);
    }

    public static void binary(int n){
        int res;
        if (n==0) System.out.println(0);
        while (n!=0){
            res = n&1;
            System.out.println(res);
            n=n>>1;
        }
    }
}

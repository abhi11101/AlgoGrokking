package com.DSA.Recursion;

public class PowerSet {
    public static void main(String[] args) {
       print("abc",0,"");
    }

    private static void print(String input,int i, String output){
        if (i==input.length()){
            System.out.println(output);
            return ;
        }

        print(input,i+1,output+input.charAt(i));
        print(input,i+1,output);
    }
}

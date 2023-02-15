package com.DSA.Recursion;

public class CombinationStringDigit {
    public static void main(String[] args) {
        find("123",0,"");
    }
    private static void find(String input, int i, String output){
        if (i==input.length()){
            System.out.println(output);
            return;
        }
        find(input,i+1,output+input.charAt(i));
        if (output!=""){
        find(input,i+1,output+" "+input.charAt(i));}
    }
}

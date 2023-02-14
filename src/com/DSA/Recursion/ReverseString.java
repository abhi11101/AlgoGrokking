package com.DSA.Recursion;

public class ReverseString {
    public static void main(String[] args) {
       String s = "Abhi";
        System.out.println(reverse(s,s.length()-1));
    }

    private static String reverse(String s, int j){
        if(j<0) return "";
        String res = s.charAt(j)+reverse(s,j-1);
        return res;
    }
}

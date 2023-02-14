package com.DSA.Recursion;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "abcdba";
        System.out.println(check(s,0,s.length()-1));
    }
    public static boolean check(String s, int i , int j){
        if (i==j || i>j)return true;
        if (s.charAt(i)!=s.charAt(j))return false;
        boolean ans = check(s,i+1,j-1);
        return ans;
    }
}

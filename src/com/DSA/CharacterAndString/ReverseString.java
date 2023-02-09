package com.DSA.CharacterAndString;

public class ReverseString {
    public static void main(String[] args) {
        char c = 'a';
        if (c>65){
            System.out.println("C");
        }
        System.out.println(reverse("Abhi"));
    }

    public static String reverse(String s){
        String res="";
        for (int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
}

package com.DSA.CharacterAndString;

public class RemoveAllOccurrencesofaSubstring {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(s.indexOf(part));
        while (s.contains(part)){
        int i =s.indexOf(part);
        s=s.substring(0,i)+s.substring(part.length()+i,s.length());
        System.out.println(s);
        }
    }
}



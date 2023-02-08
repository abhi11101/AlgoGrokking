package com.DSA.CharacterAndString;

public class Number_of_flips_to_make_binary_string_alternate {
    public static void main(String[] args) {
        System.out.println(find("1010"));
    }

    public static int find(String s){
        return Math.min(flip(s,'0'),flip(s,'1'));
    }
    public static int flip(String s, char expected){
        int count =0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c!=expected)count++;
            expected= reverse(expected);
        }
        return count;
    }
    private static char reverse(char expected){
        return (expected=='0') ? '1' : '0';
    }
}

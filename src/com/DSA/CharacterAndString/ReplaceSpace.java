package com.DSA.CharacterAndString;

public class ReplaceSpace {
    public static void main(String[] args) {
        replace("My Name Is Abhi");
    }

    public static void replace(String s){
        String res ="";

        for (int i=0;i<s.length();i++){

            if (s.charAt(i)==' '){
                res+="@40";
            }
            else res+=s.charAt(i);

        }
        System.out.println(res);
    }
}

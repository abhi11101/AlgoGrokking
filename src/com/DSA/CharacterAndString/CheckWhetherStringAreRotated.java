package com.DSA.CharacterAndString;

public class CheckWhetherStringAreRotated {
    public static void main(String[] args) {
        String s1= "rvvsvczyczqjojiovkpokdbaeggkqbchwxzucasgzlpquzeplvfvygxepdofftmdsnxunscpdthxslpdgub";
        String s2 = "vsvczyczqjojiovkpokdbaeggkqbchwxzucasgzlpquzeplvfvygxepdofftmdsnxunscpdthxslpdgubrv";
       // System.out.println(s1.length() + " "+ s2.length());
         System.out.println(find(s1,s2));
    }

    public static boolean find(String first, String second){
        if (first.length()!=second.length())return false;
        first=first+first;
        return first.contains(second);
    }
}

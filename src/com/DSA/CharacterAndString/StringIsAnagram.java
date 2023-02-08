package com.DSA.CharacterAndString;

import java.util.HashMap;
import java.util.HashSet;

public class StringIsAnagram {
    public static void main(String[] args) {
        System.out.println(find("ABHIJEET", "HIBA"));
    }

    public static boolean find(String s1, String s2){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for (int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            if (map.containsKey(c)){
                if (map.get(c)==1)map.remove(c);
                else map.put(c,map.get(c)-1);
            }
            else return false;
        }
        return true;
    }
}

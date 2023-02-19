package com.DSA.CharacterAndString;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        work("treettt");
    }
    private static void work(String s){
        TreeMap<Character,Integer> map = new TreeMap<>();
        for (int i =0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        show(map);
    }
    private static void show(Map<Character,Integer> map){
        for (Map.Entry<Character,Integer> m: map.entrySet()){
            System.out.println(m.getKey()  + " " + m.getValue());
        }
    }
}

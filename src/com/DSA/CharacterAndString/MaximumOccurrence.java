package com.DSA.CharacterAndString;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurrence {
    public static void main(String[] args) {
        find("abhijeetAAa");
    }

    public static void find(String line){
        HashMap<Character,Integer> map = new HashMap<>();
        int max=-1;
        char ans='*';
        for(int i=0;i<line.length();i++){
            char v = line.charAt(i);
            map.put(v,map.getOrDefault(v,0)+1);
            if(map.get(v)>max || map.get(v)==max && v<ans){
                max=map.get(v);
                ans=v;
            }
        }
        System.out.println(ans);
        for (Map.Entry<Character,Integer> m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

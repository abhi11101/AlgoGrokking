package com.CodeHelp.C14_HashMapAndTries.Assignment;

import java.util.*;

/*
https://leetcode.com/problems/top-k-frequent-words/
 */
public class A6_TopKFrequentWords_LEETCODE {

    public static void main(String[] args) {

        String[] words = {"i","love","leetcode","i","love","coding"};
        System.out.println(topKFrequent(words, 2));

        System.out.println("i".compareTo("love"));

    }

    public static List<String> topKFrequent(String[] words, int k) {

        Map<String,Integer> map = new HashMap<>();

        for (String word : words) {

            map.put(word,map.getOrDefault(word,0)+1);

        }

        PriorityQueue<String> maxHeap = new PriorityQueue<>((a,b)->{

            if (map.get(a)>map.get(b))return -1; //-ve means a will come first
            else if (map.get(a)==map.get(b)){
                return a.compareTo(b);
            }else return +1; //+ve means b will come first

        });

        for (String word : map.keySet()) {
            maxHeap.add(word);
        }

        List<String> ans = new ArrayList<>();
        while (!maxHeap.isEmpty() && k>0){

            ans.add(maxHeap.poll());
            k--;

        }

        return ans;
    }

}

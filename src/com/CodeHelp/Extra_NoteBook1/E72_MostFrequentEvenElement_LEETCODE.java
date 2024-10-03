package com.CodeHelp.Extra_NoteBook1;

import java.util.HashMap;

/*
https://leetcode.com/problems/most-frequent-even-element/
 */
public class E72_MostFrequentEvenElement_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {0,1,2,2,4,4,1};
        System.out.println(mostFrequentEven(arr));

        String s = "abc def ghi";
    }

    public static int mostFrequentEven(int[] nums) {

        int ans = -1;

        HashMap<Integer,Integer> map = new HashMap<>();
        int maxFreq = 0;
        int freq ;
        for (int x : nums) {
            if ((x&1)==0){

                map.put(x,map.getOrDefault(x,0)+1);
                freq = map.get(x);
                if (freq>maxFreq || (freq==maxFreq && x<ans)){
                    ans = x;
                    maxFreq = freq;
                }
            }
        }

        return ans;
    }
}

package com.CodeHelp.Extra;

public class E30_MergeStringsAlternately_LEETCODE {

    public static void main(String[] args) {

        System.out.println(mergeAlternately("abc","pqr"));
        System.out.println(mergeAlternately("ab","pqrs"));

    }

    public static String mergeAlternately(String word1, String word2) {

        int w1Index =0;
        int w2Index =0;

        StringBuilder ans =new StringBuilder();
        while (w1Index < word1.length() && w2Index < word2.length()){

            ans.append(word1.charAt(w1Index));
            ans.append(word2.charAt(w2Index));
            w1Index++;
            w2Index++;

        }

        if (w1Index != word1.length()){
            ans.append(word1.substring(w1Index));
        }
        if (w2Index != word2.length()){
            ans.append(word2.substring(w2Index));
        }

        return ans.toString();
    }
}

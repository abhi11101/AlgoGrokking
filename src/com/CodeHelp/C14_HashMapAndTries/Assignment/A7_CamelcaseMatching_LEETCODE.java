package com.CodeHelp.C14_HashMapAndTries.Assignment;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/camelcase-matching/
 */
public class A7_CamelcaseMatching_LEETCODE {

    public static void main(String[] args) {

        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        System.out.println(camelMatch(queries,"FB"));

        String[] queries2 = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        System.out.println(camelMatch(queries2,"FoBa"));

    }

    public static List<Boolean> camelMatch(String[] queries, String pattern) {

        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {

            String word = queries[i];
            int wordIndex = 0;
            int patternIndex = 0;

            while (wordIndex < word.length() && patternIndex < pattern.length()) {

                char wordChar = word.charAt(wordIndex);
                char patternChar = pattern.charAt(patternIndex);

                if (wordChar == patternChar) {
                    wordIndex++;
                    patternIndex++;
                }else if (wordChar>='a' && wordChar<='z'){
                    wordIndex++;
                }else break;

            }

            if (wordIndex == word.length() && patternIndex == pattern.length()) {
                result.add(true);
            }else if (wordIndex<word.length()){

                while ( wordIndex< word.length() && word.charAt(wordIndex)>='a' && word.charAt(wordIndex)<='z')wordIndex++;

                if (wordIndex==word.length())result.add(true);
                else result.add(false);

            }else result.add(false);

        }

        return result;
    }

}

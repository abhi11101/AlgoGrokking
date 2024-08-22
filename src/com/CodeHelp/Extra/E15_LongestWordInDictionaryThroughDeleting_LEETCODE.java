package com.CodeHelp.Extra;

import java.util.List;

/*
https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/description/
 */
public class E15_LongestWordInDictionaryThroughDeleting_LEETCODE {

    public static void main(String[] args) {

        List<String> dictionary1 = List.of("ale","apple","monkey","plea");
        List<String> dictionary2 = List.of("a","b","c");
        List<String> dictionary3 = List.of("abe","abc");

        System.out.println(findLongestWord("abpcplea", dictionary1));
        System.out.println(findLongestWord("abpcplea", dictionary2));
        System.out.println(findLongestWord("abce", dictionary3));

        System.out.println(fasterWay("abpcplea", dictionary1));
        System.out.println(fasterWay("abpcplea", dictionary2));
        System.out.println(fasterWay("abce", dictionary3));


    }

    public static String fasterWay(String s, List<String> dictionary) {

        String ans = "";

        for (String word : dictionary) {

            int wordLength = word.length();
            int maxLength = ans.length();

            if (wordLength<maxLength || (wordLength==maxLength && word.compareTo(ans)>0)){
                continue;
            }

            int pos = -1;

            for (int i =0; i<wordLength;i++){

                pos = s.indexOf(word.charAt(i),pos+1);
                if (pos==-1){
                    break;
                }

            }
            if (pos!=-1){
                ans = word;
            }
        }

        return ans;

    }

    public static String findLongestWord(String s, List<String> dictionary) {

        String longestWord = "";

        for (String word : dictionary) {

            if (isSubsequence(word,s)){

                if (word.length() > longestWord.length() || word.length() == longestWord.length() && word.compareTo(longestWord) < 0){
                    longestWord = word;
                }
            }
        }

        return longestWord;

    }

    public static boolean isSubsequence(String word, String s) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < word.length()) {

            if (s.charAt(i) == word.charAt(j)) {
              j++;
            }
            i++;

        }
        return j == word.length();

    }

    public static String findLongestWordWithoutSequence(String s, List<String> dictionary) {

        int[] freq = new int[26];
        int maxLength =0;
        String longestWord = "";
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            freq[c - 'a']++;

        }

        for (String st : dictionary) {

            boolean found = false;
            int[] stFreq = new int[26];

            for (int i = 0; i < st.length(); i++) {
                char ch = st.charAt(i);
                // Creating freq table
                stFreq[ch - 'a']++;
            }

            for (int i = 0; i < 26; i++) {

                if (stFreq[i]<=freq[i]){
                    found = true;
                }else {
                    found = false;
                    break;
                }
            }

            if (found){
                if (maxLength<st.length() || maxLength==st.length() && st.compareTo(longestWord)<0){
                    maxLength = st.length();
                    longestWord = st;
                }
            }

        }

        return longestWord;

    }


}

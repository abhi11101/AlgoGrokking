package com.CodeHelp.C14_HashMapAndTries.Assignment;

import java.util.List;

/*
https://leetcode.com/problems/replace-words/
 */
public class A5_ReplaceWords_LEETCODE {

    public static void main(String[] args) {

        List<String> dictionary  = List.of("cat","bat","rat");
        String sentence = "the cattle was rattled by the battery";

        System.out.println(replaceWords(dictionary, sentence));

        List<String> dc2 = List.of("a","b","c");
        String sentence2 = "aadsfasf absbs bbab cadsfafs";
        System.out.println(replaceWords(dc2, sentence2));
    }

    public static String replaceWords(List<String> dictionary, String sentence) {

        A5_Trie root = new A5_Trie('-');

        for (String word : dictionary) {

            insertWord(root,word,0);

        }

        String[] str = sentence.split(" ");

        for (int i = 0; i < str.length; i++) {

            replace(root,str,i);

        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length; i++) {

            ans.append(str[i]);

            if (i!=str.length-1){
                ans.append(" ");
            }

        }

        return ans.toString();
    }

    public static void replace(A5_Trie root, String[] str, int index) {


        String word = str[index];

        A5_Trie prev = root;
        StringBuilder prefix = new StringBuilder();
        for (int i =0;i<word.length();i++){

            char ch = word.charAt(i);
            int charIndex = ch -'a';

            A5_Trie curr = prev.children[charIndex];

            if (curr == null)break;

            prefix.append(ch);

            if (curr.isTerminal){

                str[index] = prefix.toString();
                break;

            }
            prev = curr;
        }

    }

    public static void insertWord(A5_Trie root, String word , int index){

        if (index==word.length()){

            root.isTerminal = true;
            return;
        }

        char ch = word.charAt(index);
        int charIndex = ch - 'a';

        A5_Trie child;

        if (root.children[charIndex]!=null){

            child = root.children[charIndex];

        }else {

            child = new A5_Trie(ch);
            root.children[charIndex] = child;
        }

        insertWord(child, word, index+1);

    }

}

class A5_Trie{

    char data;
    A5_Trie[] children;
    boolean isTerminal;

    public A5_Trie(char data) {
        this.data = data;
        this.children = new A5_Trie[26];
        this.isTerminal = false;
    }
}
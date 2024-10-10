package com.CodeHelp.C14_HashMapAndTries;

import java.util.ArrayList;
import java.util.List;

public class C3_SuggestionSystem {

    public static void main(String[] args) {

        String[] word = {"mobile","mouse","moneypot","monitor","mousepad"};

        findSuggestion(word,"mouse");
    }

    public static List<List<String>> findSuggestion(String[] words, String searchWord){

        C3_Trie root = new C3_Trie('-');
        for (int i =0; i<words.length; i++){
            insertWord(root, words[i], 0);
        }

        List<List<String>> ans = getSuggestions(root,searchWord);

        System.out.println(ans);

        return ans;
    }

    public static List<List<String>> getSuggestions(C3_Trie root, String searchWord){

        C3_Trie prev = root;
        List<List<String>> ans = new ArrayList<>();
        StringBuilder prefix = new StringBuilder();
        for (int i =0;i<searchWord.length();i++){

            char lastCh = searchWord.charAt(i);

            int charIndex = lastCh - 'a';
            C3_Trie curr = prev.children[charIndex];

            if (curr!=null){

                List<String> temp = new ArrayList<>();
                prefix.append(lastCh);
                storeSuggestions(curr,temp,prefix);
                ans.add(temp);
                prev = curr;
            }else break;


        }

        return ans;
    }

    public static void storeSuggestions(C3_Trie curr, List<String> temp, StringBuilder prefix){

        if (curr.isTerminal){

            temp.add(prefix.toString());
        }

        for (char ch = 'a' ; ch <= 'z' ; ch++){

            int index = ch - 'a';
            C3_Trie next = curr.children[index];

            if (next != null){
               prefix.append(ch);
               storeSuggestions(next,temp,prefix);
               prefix.deleteCharAt(prefix.length()-1);
            }

        }


    }

    public static void insertWord(C3_Trie root, String word, int index){

        if (index==word.length()){
            root.isTerminal = true;
            return;
        }

        char ch = word.charAt(index);
        int charIndex = ch - 'a';

        C3_Trie child;

        if (root.children[charIndex]!=null){

            child = root.children[charIndex];
        }else{
            child = new C3_Trie(ch);
            root.children[charIndex] = child;
        }

        insertWord(child, word, index+1);
    }

}

class C3_Trie{

    char data;
    C3_Trie[] children;
    boolean isTerminal;

    public C3_Trie(char data) {
        this.data = data;
        children = new C3_Trie[26];
        isTerminal = false;
    }
}
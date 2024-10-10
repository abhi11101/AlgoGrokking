package com.CodeHelp.C14_HashMapAndTries;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/*
https://leetcode.com/problems/search-suggestions-system/description/
 */
public class C4_SearchSuggestionsSystem_LEETCODE {

    public static void main(String[] args) {

        String[] word = {"mobile","mouse","moneypot","monitor","mousepad"};

        List<List<String>> ans = suggestedProducts(word,"mouse");
        System.out.println(ans);

    }

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {

        C4_Trie root = new C4_Trie('-');

        for (int i = 0; i < products.length; i++) {
            insertWord(root,products[i],0);
        }

        return giveSuggestions(root,searchWord);
    }

    public static List<List<String>> giveSuggestions(C4_Trie root, String searchWord) {

        List<List<String>> ans  = new ArrayList<>();
        StringBuilder prefix = new StringBuilder();

        C4_Trie prev = root;

        for (int i=0;i<searchWord.length();i++){

            char lastChar = searchWord.charAt(i);
            int charIndex = lastChar -'a';

            C4_Trie curr = prev.children[charIndex];

            if (curr!=null){

                prefix.append(lastChar);
                PriorityQueue<String> minHeap = new PriorityQueue<>();
                storeSuggestions(curr,prefix, minHeap);
                List<String> list = new ArrayList<>();

               int k =3;

               while (!minHeap.isEmpty() && k>0){
                   list.add(minHeap.poll());
                   k--;
               }

                ans.add(list);
                prev = curr;

            }else {
                ans.add(new ArrayList<>());
            }

        }

        return ans;

    }

    public static void storeSuggestions(C4_Trie curr, StringBuilder prefix, PriorityQueue<String> minHeap) {

        if (curr.isTerminal){

            minHeap.add(prefix.toString());
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {

            int index = ch - 'a';

            C4_Trie next = curr.children[index];

            if (next!=null){

                prefix.append(ch);
                storeSuggestions(next,prefix,minHeap);
                prefix.deleteCharAt(prefix.length()-1);

            }


        }

    }

    public static void insertWord(C4_Trie root, String word, int index){

        if (index==word.length()){
            root.isTerminal = true;
            return;
        }

        char ch = word.charAt(index);
        int charIndex = ch - 'a';

        C4_Trie child ;

        if (root.children[charIndex]!=null){
            child = root.children[charIndex];
        }else{
            child = new C4_Trie(ch);
            root.children[charIndex] = child;
        }

        insertWord(child, word, index+1);

    }

}

class C4_Trie{

    char data;
    C4_Trie[] children;
    boolean isTerminal;

    public C4_Trie(char data) {
        this.data = data;
        this.children = new C4_Trie[26];
        this.isTerminal = false;
    }
}
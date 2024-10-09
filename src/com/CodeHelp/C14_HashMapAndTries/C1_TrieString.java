package com.CodeHelp.C14_HashMapAndTries;

public class C1_TrieString {

    public static void main(String[] args) {

        C1_Trie root = new C1_Trie('-');
        insertWord(root,"CODING",0);
        System.out.println(searchWord(root,"CODING",0));

        insertWord(root,"CODER",0);
        System.out.println(searchWord(root,"CODER",0));

        insertWord(root,"LEETCODE",0);
        System.out.println(searchWord(root,"LEETCODE",0));
    }

    public static void insertWord(C1_Trie root, String word, int i) {

        if (i==word.length()){
            root.isTerminal=true;
            return;
        }

        char ch = word.charAt(i);
        int index = ch - 'A';
        C1_Trie child ;

        if (root.children[index]!=null){
            child = root.children[index];
        }else{
            child = new C1_Trie(ch);
            root.children[index] = child;
        }

        insertWord(child,word,i+1);
    }

    public static boolean searchWord(C1_Trie root, String word, int index) {

        if (index==word.length()){
            return root.isTerminal;
        }

        char ch = word.charAt(index);
        int charIndex = ch - 'A';

        C1_Trie child;

        if (root.children[charIndex]!=null){
            child = root.children[charIndex];
        }else{
            return false;
        }

        return searchWord(child,word,index+1);
    }
}

class C1_Trie {

    char data;
    C1_Trie[] children;
    boolean isTerminal;

    public C1_Trie(char data) {
        this.data = data;
        this.children = new C1_Trie[26];
        this.isTerminal = false;
    }
}
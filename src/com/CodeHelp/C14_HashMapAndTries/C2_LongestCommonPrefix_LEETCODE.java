package com.CodeHelp.C14_HashMapAndTries;

/*
https://leetcode.com/problems/longest-common-prefix/
 */
public class C2_LongestCommonPrefix_LEETCODE {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

        String[] strs2 = {"code","coder","codehelp"};
        System.out.println(longestCommonPrefix(strs2));
    }

    public static String longestCommonPrefix(String[] strs) {

        C2_Trie root = new C2_Trie('-');

        for (int i = 0; i < strs.length; i++) {
            insertWord(strs[i],root,0);
        }

        String temp = strs[0];

        StringBuilder ans = new StringBuilder();

        findCommon(root,temp,ans);


        return ans.toString();
    }

    public static void findCommon(C2_Trie root, String str, StringBuilder ans) {

        if (root.isTerminal)return;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            System.out.println("Root is " + root.data);
            if (root.childCount==1){

                ans.append(ch);
                System.out.println("CH " + ch);
                int index = ch - 'a';
                root = root.children[index];

            }else break;

            if (root.isTerminal)break;

        }


    }

    public static void insertWord(String word, C2_Trie root, int index){

        if (index == word.length()){
            root.isTerminal = true;
            return;
        }

        char ch = word.charAt(index);
        int charIndex = ch - 'a';

        C2_Trie child ;
        if (root.children[charIndex]!=null){
            child = root.children[charIndex];
        }else{
            child = new C2_Trie(ch);
            System.out.println("Root "  + root.data);
            root.childCount++;
            System.out.println("Child count " + root.childCount);
            root.children[charIndex] = child;
        }


        insertWord(word,child,index+1);

    }

    public static boolean searchWord(String word, C2_Trie root, int index){

        if (index == word.length()){

            if (root.isTerminal){
                return true;
            }else{
                return false;
            }

        }

        char ch = word.charAt(index);
        int charIndex = ch - 'a';

        if (root.children[charIndex]!=null){
            C2_Trie child = root.children[charIndex];
            return searchWord(word,child,index+1);
        }else{
            return false;
        }
    }

}

class C2_Trie{

    char data;
    C2_Trie[] children;
    boolean isTerminal;
    int childCount;

    public C2_Trie(char data) {
        this.data = data;
        children = new C2_Trie[26];
        isTerminal = false;
        childCount = 0;
    }

}
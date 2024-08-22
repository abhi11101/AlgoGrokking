package com.CodeHelp.Extra;

/*
https://leetcode.com/problems/verifying-an-alien-dictionary/description/
 */
public class E14_VerifyingAnAlienDictionary_LEETCODE {

    public static void main(String[] args) {

        String[] words1 = {"hello","leetcode"};
        String[] words2 = {"word","world","row"};
        String[] words3 = {"apple","app"};
        String[] words4 = {"apap","app"};

        System.out.println(isAlienSorted(words1,"hlabcdefgijkmnopqrstuvwxyz"));
        System.out.println(isAlienSorted(words2,"worldabcefghijkmnpqstuvxyz"));
        System.out.println(isAlienSorted(words3,"abcdefghijklmnopqrstuvwxyz"));
        System.out.println(isAlienSorted(words4,"abcdefghijklmnopqrstuvwxyz"));

    }

    public static boolean isAlienSorted(String[] words, String order) {


        int[] rank = new int[26];

        for (int i=0; i<26; i++) {

            char ch  = order.charAt(i);
            rank[ch-'a']=i+1;

        }
        printArray(rank);

        for (int i=0; i<words.length-1; i++) {

            String s1 = words[i];
            String s2 = words[i+1];
            int s1Index=0;
            int s2Index=0;
            boolean prefix = false;
            while (s1Index<s1.length() && s2Index<s2.length()) {

                int s1Char = s1.charAt(s1Index);
                int s2Char = s2.charAt(s2Index);

                int s1Rank = rank[s1Char-'a'];
                int s2Rank = rank[s2Char-'a'];

                if (s1Rank>s2Rank) {
//                    System.out.println("If");
                    return false;
                }else if(s1Rank<s2Rank){
                    prefix = false;
//                    System.out.println("Else if");
                    break;
                }
                else {
//                    System.out.println("Else");
                    prefix = true;
                    s1Index++;
                    s2Index++;
                }
            }
            if ( prefix && s1.length()>s2.length())return false;
        }

        return true;


    }

    private static void printArray(int[] arr){

        for (int s : arr){
            System.out.print(s + " ");
        }
        System.out.println();

    }


}

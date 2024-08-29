package com.CodeHelp.C5_RecursionAndBacktracking.Assignment;

/*
https://leetcode.com/problems/wildcard-matching/description/
 */
public class A10_WildcardMatching_LEETCODE {

    public static void main(String[] args) {

        System.out.println(isMatch("aa","a"));
        System.out.println(isMatch("aa","*"));
        System.out.println(isMatch("abcdefg","ab*fg"));
    }

    public static boolean isMatch(String s, String p) {

        return helper(s,0,p,0);

    }

    public static boolean helper(String s, int sIndex, String p, int pIndex){

        if (sIndex == s.length() && pIndex == p.length()){
            return true;
        }
        else if (sIndex == s.length() && pIndex<p.length()){

            while (pIndex<p.length()){
                if (p.charAt(pIndex) != '*'){return false;}
                pIndex++;
            }
            return true;

        }
        else if (sIndex<s.length() && pIndex==p.length()){return false;}
        else if (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex)== '?'){
            return helper(s, sIndex+1, p, pIndex+1);
        }

        else if (p.charAt(pIndex) == '*'){

            //Skip *

            boolean excludeCase = helper(s,sIndex,p,pIndex+1);

            // Use *

            boolean includeCase = helper(s,sIndex+1,p,pIndex);

            return excludeCase || includeCase;
        }

        // character does not match
        return false;

    }



}

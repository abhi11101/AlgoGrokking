package com.DSA.CharacterAndString;

import java.util.Stack;

public class PermutationInString {
    public static void main(String[] args) {
       System.out.println(find("eidboaoo","ab"));
        System.out.println(fastApproach("eidboaoo","ab"));
    }

    public static boolean find(String s1, String s2){
        int[] arr = new int[26];
        int n=s2.length();
        for (int i=0;i<n;i++){
            arr[s2.charAt(i)-97]+=1;
        }
        String ans="";
        for (int i=0;i<n;i++){
            ans+=s1.charAt(i);
        }

        for (int i=0,j=n-1;j<s1.length();){
       //     System.out.println(ans);
            if (check(ans,arr)){
                return true;
            }
            else {
                i++;
                j++;
                if (j<s1.length()){
                    ans=s1.substring(i,j+1);
                }else return false;
            }
        }
        return false;

    }

    public static boolean check(String s,int[]arr){
        int[] val = new int[26];
        for (int i=0;i<s.length();i++){
            val[s.charAt(i)-97]+=1;
        }
        for (int i=0;i<26;i++){
            if (val[i]!=arr[i])return false;
        }
        return true;
    }

    public static boolean fastApproach(String s1,String s2){
        int[] a = new int[26];
        int ws = s2.length();
        for (int i=0;i<ws;i++){
            int index = s2.charAt(i)-'a';
            a[index]++;
        }
        int[] b = new int[26];
        int i=0;
        while (i<ws && i<s1.length()){
            int index = s1.charAt(i)-'a';
            b[index]++;
            i++;
        }
        if (checkEqual(a,b))return true;
        while (i<s1.length()){
            int newChar = s1.charAt(i)-'a';
            b[newChar]++;
            int oldChar = s1.charAt(i-ws)-'a';
            b[oldChar]--;
            i++;
            if (checkEqual(a,b))return true;
        }
        return false;
    }

    public static boolean checkEqual(int[] a,int[] b){
        for (int i=0;i<26;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }
}

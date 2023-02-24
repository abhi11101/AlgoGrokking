package com.DSA.Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringPermutation {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        HashSet<String> res = new HashSet<>();
        String s ="abb";
        char[] input = new char[s.length()];
        for (int i=0;i<s.length();i++){
            input[i]=s.charAt(i);
        }
     //   rec(input,0,ans);

        unique(input,0,res);
        showList(res);
    }


    private static void rec(char[] input, int index,List<String> ans){
        if(index==input.length){
            String res="";
            for(char c : input){
                res+=c;
            }
            ans.add(res);
            return;
        }

        for(int k=index;k<input.length;k++){
            swap(input,index,k);
            rec(input,index+1,ans);
            swap(input,index,k);
        }
    }

    private static void unique(char[] input, int index, HashSet<String> ans){
        if(index==input.length){
            String res="";
            for(char c : input){
                res+=c;
            }
            if (res.length()==input.length)ans.add(res);
            return;
        }

        for(int k=index;k<input.length;k++){
        //    if (k>index && input[k]==input[k-1])continue;
            swap(input,index,k);
            unique(input,index+1,ans);
            swap(input,index,k);
        }
    }

    private static void swap(char[] inout, int i, int j){
        char temp = inout[i];
        inout[i] = inout[j];
        inout[j]=temp;
    }
    private static void showList(HashSet<String> ans){
        for (String s : ans){
            System.out.println(s);
        }
    }
}

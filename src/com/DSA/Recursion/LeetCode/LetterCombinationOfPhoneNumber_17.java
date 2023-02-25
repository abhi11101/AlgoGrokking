package com.DSA.Recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber_17 {
    public static void main(String[] args) {
        String[] data = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> curr = new ArrayList<>();
        StringBuilder output = new StringBuilder("");
        find("237",0,curr,data,output);
        showList(curr);

    }

    private static void find(String input, int i, List<String> curr, String[] data,StringBuilder output){
        if (i==input.length()){
            curr.add(output.toString());
            return;
        }
        int index = input.charAt(i)-'2';
        String currentData = data[index];
        for (int k=0;k<currentData.length();k++){
            output.append(currentData.charAt(k));
            find(input,i+1,curr,data,output);
            output.deleteCharAt(output.length()-1);
       }
    }

    private static void showList(List<String> ans){
            for (String s : ans){
                System.out.println(s);
            }
        }
    }

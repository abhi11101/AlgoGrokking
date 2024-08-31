package com.CodeHelp.C6_DivideAndConquerBacktracking;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 */
public class C8_LetterCombinationsOfPhoneNumber_LEETCODE {

    public static void main(String[] args) {

        List<String> ans = letterCombinations("23");
        printList(ans);
    }

    public static List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();
        if(digits==null || digits.length()==0)return ans;

        String[] data = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder output = new StringBuilder();

        find(digits,0,data,output,ans);

        return ans;
    }

    public static void find(String input,int index,String[] data,StringBuilder output,List<String> ans){

        if (index==input.length()){
            ans.add(output.toString());
            return;
        }

        int digitIndex = input.charAt(index) - '2';
        String current = data[digitIndex];

        for (int i =0;i<current.length();i++){

            output.append(current.charAt(i));
            find(input,index+1,data,output,ans);
            output.deleteCharAt(output.length()-1);

        }

    }
    private static void printList(List<String> list) {

        for (String x: list){
            System.out.print(x + " ");
        }
        System.out.println();

    }



}

package com.CodeHelp.C6_DivideAndConquerBacktracking;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/generate-parentheses/description/
 */
public class C7_GenerateParentheses_LEETCODE {

    public static void main(String[] args) {

        List<String> ans = generateParenthesis(3);
        printList(ans);

    }

    public static List<String> generateParenthesis(int n) {

        List<String> ans =new ArrayList<>();

        int currOpen = 1;
        int remOpen = n-1;
        int currClose = 0;
        int remClose = n;
        StringBuilder output = new StringBuilder("(");

        solve(currOpen,remOpen,currClose,remClose,output,ans);

        return ans;
    }

    public static void solve(int currOpen, int remOpen, int currClose, int remClose, StringBuilder output, List<String> ans) {

        if (remOpen==0 && remClose==0){
            ans.add(output.toString());
            return;
        }

        if (remOpen>0){

            output.append("(");
            solve(currOpen+1,remOpen-1,currClose,remClose,output,ans);
            output.deleteCharAt(output.length()-1);

        }

        if (remClose>0 && currOpen>currClose){
            output.append(")");
            solve(currOpen,remOpen,currClose+1,remClose-1,output,ans);
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

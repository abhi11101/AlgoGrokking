package com.DSA.Recursion.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GenerateParentheses_22 {
    public static void main(String[] args) {
        List<String> ans = generateParenthesis(3);
        showList(ans);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int remOpen=n-1;
        int currOpen =1;
        int currClose =0;
        int remClose =n;
        StringBuilder output = new StringBuilder("(");
        rec(remOpen,currOpen,remClose,currClose,ans,output);

        return ans;
    }

    public static void rec(int remOpen, int currOpen,int remClose,int currClose,List<String> ans,
                           StringBuilder output){
      if (remOpen==0 && remClose==0){
          ans.add(output.toString());
          return;
      }

      //Open
        if (remOpen>0){
            output.append("(");
            rec(remOpen-1,currOpen+1,remClose,currClose,ans,output);
            output.deleteCharAt(output.length()-1);
        }

        if (remClose>0 && currOpen>currClose){
            output.append(")");
            rec(remOpen,currOpen,remClose-1,currClose+1,ans,output);
            output.deleteCharAt(output.length()-1);
        }


    }
    private static void showList(List<String> ans){
        for (String s : ans){
            System.out.println(s);
        }
    }
}

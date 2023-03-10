package com.DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringAbbrevation {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        String st = "";
        String s = "GFG";
       printCompRec(s, 0, s.length(), st,ans);
        showList(ans);
    }
    static void printCompRec(String input, int index, int max_index, String output,List<String> ans)
    {

        if (index == max_index) {
            ans.add(output);
            return;
        }

        output = output + input.charAt(index);
        printCompRec(input, index + 1, max_index, output,ans);
        output = output.substring(0, output.length() - 1);

        int count = 1;

        if (output.length() > 0) {
            if (output.charAt(output.length()-1) >= '0' && output.charAt(output.length() -1) <= '9') {

                count = count + (output.charAt(output.length()-1) - '0');
                output = output.substring(0, output.length() - 1);
            }
        }

        char to_print = (char)(count + '0');
        output = output + to_print;
        printCompRec(input, index + 1, max_index, output,ans);
    }
    private static void showList(List<String> ans){
        for (String s : ans){
            System.out.println(s);
        }
    }
}

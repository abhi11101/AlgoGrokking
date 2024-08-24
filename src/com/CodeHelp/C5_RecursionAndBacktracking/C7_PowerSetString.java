package com.CodeHelp.C5_RecursionAndBacktracking;

public class C7_PowerSetString {

    public static void main(String[] args) {

        printPowerSet("abc",0,"");
    }


    public static void printPowerSet(String input, int index, String output) {

        if (index== input.length()) {
            System.out.println(output);
            return;
        }

        printPowerSet(input,index+1,output+input.charAt(index));
        printPowerSet(input, index+1, output);


    }

}

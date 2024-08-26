package com.CodeHelp.C5_RecursionAndBacktracking.Assignment;

public class A5_RemoveAllOccurrenceOfSubstring {

    public static void main(String[] args) {

        System.out.println(removeAllOccurrences("daabcbaabcbc","abc"));
        System.out.println(removeAllOccurrences("axxxxyyyyb","xy"));
    }

    public static String removeAllOccurrences(String str, String part) {

        if (str.indexOf(part)==-1){
            return str;
        }

        int index = str.indexOf(part);

        str = str.substring(0,index) + str.substring(index+part.length());

        return removeAllOccurrences(str, part);

    }


}

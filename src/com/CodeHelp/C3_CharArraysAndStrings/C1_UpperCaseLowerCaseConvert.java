package com.CodeHelp.C3_CharArraysAndStrings;

public class C1_UpperCaseLowerCaseConvert {

    public static void main(String[] args) {

        char[] chars = {'a','b','c','d','e','f'};
        toUpperCase(chars);

        char[] lower = {'A','B','C','D','E','F'};
        toLowerCase(lower);

    }

    public static void toUpperCase(char[] chars) {

        for (int i = 0; i < chars.length; i++) {

            chars[i] = (char) (chars[i] + 'A' - 'a');

        }
        printArray(chars);

    }

    public static void toLowerCase(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - 'A' + 'a');
        }
        printArray(chars);
    }

    private static void printArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

}

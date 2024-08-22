package com.CodeHelp.C3_CharArraysAndStrings.Assignment;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/zigzag-conversion/
 */
public class A13_ZigzagConversion_LEETCODE {

    public static void main(String[] args) {

        System.out.println(convert("PAYPALISHIRING",3));

    }

    public static String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // List to hold each row's characters
        List<StringBuilder> rows = new ArrayList<>();
        int min = Math.min(numRows, s.length());
        for (int i = 0; i < min; i++) {
            rows.add(new StringBuilder());
        }

        int indexOfS = 0;
        int row = 0;
        boolean directionDown = false;

        // Traverse through the string, adding characters to the appropriate row
        while (indexOfS < s.length()) {
            rows.get(row).append(s.charAt(indexOfS));
            if (row == 0 || row == numRows - 1) {
                directionDown = !directionDown; // Change direction at the top or bottom row
            }
            row += directionDown ? 1 : -1; // Move up or down
            indexOfS++;
        }

        // Combine rows to form the final zigzag string
        StringBuilder ans = new StringBuilder();
        for (StringBuilder rowContent : rows) {
            ans.append(rowContent);
        }

        return ans.toString();

    }

}

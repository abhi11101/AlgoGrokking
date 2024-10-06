package com.CodeHelp.Extra_NoteBook1;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/reverse-words-in-a-string/description/
 */
public class E74_ReverseWordsInString_LEETCODE {

    public static void main(String[] args) {

        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {

        int index =0;
        char[] charArray = s.toCharArray();

        List<String> list = new ArrayList<>();
        while (index < charArray.length) {

            StringBuilder sb = new StringBuilder();
            while (index < charArray.length && charArray[index] == ' ') {
                index++;
            }


            while (index < charArray.length && charArray[index] != ' ') {
                sb.append(charArray[index]);
                index++;
            }

            if (!sb.isEmpty())list.add(sb.toString());
        }
        System.out.println(list);

        int left =0;
        int right = list.size()-1;
        while (left < right) {

            String temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }

        StringBuilder ans =new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            ans.append(list.get(i));
            if (i!=list.size()-1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }

}

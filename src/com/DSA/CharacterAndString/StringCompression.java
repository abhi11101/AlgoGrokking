package com.DSA.CharacterAndString;

public class StringCompression {
    public static void main(String[] args) {
        char[] c = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(c));
    }

    public static int compress(char[] chars){
    int ansIndex=0;
    int n =chars.length;
    int i=0;
    while (i<n){
        int j=i+1;
        while (j<n && chars[i]==chars[j]){
            j++;
        }
        chars[ansIndex++]=chars[i];
        int count=j-i;
        if (count>1){
            String s = Integer.toString(count);
           for (int k =0;k<s.length();k++){
               chars[ansIndex++]=s.charAt(k);
           }
        }
        i=j;
    }
    return ansIndex;
    }
}


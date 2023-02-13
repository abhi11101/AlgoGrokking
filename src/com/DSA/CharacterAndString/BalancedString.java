package com.DSA.CharacterAndString;

public class BalancedString {
    public static void main(String[] args) {
        System.out.println(check("RLRRRLLRLL"));
    }

    public static int check(String s){
        int count =0;
        int Rcount=0;
        int Lcount=0;
        int i=0;
        while (i<s.length()){
            if (s.charAt(i)=='R'){
                Rcount++;
            }
            else Lcount++;
            if (Rcount==Lcount)count++;
            i++;
        }
        return count;
    }
}

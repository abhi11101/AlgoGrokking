package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/power-of-two/description/
 */
public class E4_PowerOfTwo_LEETCODE {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(128));
    }

    public static boolean isPowerOfTwo(int n) {

        return n>0 && (n&(n-1)) == 0;
    }

    public static boolean isPowerOfTwo2(int n) {

        if (n==0) return false;
        int count=0;
        while (n>0){
            if ((n&1)==1)count++;
            n>>=1;

        }
        if (count==1)return true;
        else return false;

    }

}

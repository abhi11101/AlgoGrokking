package com.CodeHelp.Extra_NoteBook1;

/*

https://leetcode.com/problems/number-complement/description/

 */
public class E3_NumberComplement_LEETCODE {

    public static void main(String[] args) {

    work(5);

    }

    public static void work(int n){

        int mask =0;

        while (mask<n){

            mask = (mask<<1) | 1;
        }

        int ans = (~n) & mask;
        System.out.println(ans);


    }

}

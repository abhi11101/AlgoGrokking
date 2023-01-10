package com.Unacademy.ProgrammingBasic.Basic3;

public class LeetCode_476 {

    public static void main(String[] args) {
       int res = comp(4);
        System.out.println(res);
    }
    public static int comp(int num){
        int mask =0;
        while (mask<num) {
            mask = (mask << 1) | 1;
        }
        int ans = mask&(~num);

        return ans;
    }


}

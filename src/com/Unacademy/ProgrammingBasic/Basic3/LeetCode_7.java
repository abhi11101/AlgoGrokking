package com.Unacademy.ProgrammingBasic.Basic3;

public class LeetCode_7 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int n){
        int ans=0;

        while (n!=0){
            double ans2 = ans;
            if(ans2*10 > Integer.MAX_VALUE || ans2*10 < Integer.MIN_VALUE)return 0;
            ans = (ans*10) + n%10;
            System.out.println(ans);
            n = n/10;

        }
        return ans;
    }
}

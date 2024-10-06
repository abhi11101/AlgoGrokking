package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/find-the-highest-altitude/description/
 */
public class E76_FindTheHighestAltitude_LEETCODE {

    public static void main(String[] args) {

        int[] gains1 = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gains1));

        int[] gains2 = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gains2));

    }

    public static int largestAltitude(int[] gain) {

        int[] ans = new int[gain.length+1];
        ans[0] = 0;

        int max = 0;
        for (int i =0;i<gain.length;i++){
            ans[i+1] = ans[i]+gain[i];
            max = Math.max(max,ans[i+1]);
        }
        return max;
    }

}

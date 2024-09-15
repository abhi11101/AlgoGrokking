package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/koko-eating-bananas/description/
 */
public class E31_KokoEatingBananas_LEETCODE {

    public static void main(String[] args) {
        System.out.println(Math.ceil((double) 11/5));
        int[] piles = {3,6,7,11};
        System.out.println(minEatingSpeed(piles,8));
        int[] piles2 = {30,11,23,4,20};
//        System.out.println(minEatingSpeed(piles2,5));
        int[] piles3 = {30,11,23,4,20};
//        System.out.println(minEatingSpeed(piles3,6));

        int[] piles4 = {34392671,891616382,813261297};
        System.out.println(minEatingSpeed(piles4,712127987));
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int start =0;
        int end = 0;
        for (int x : piles) {
           if (x>end)end=x;
        }
        int mid = 0;
        int ans = -1;
        while (start<=end){

            mid = start+(end-start)/2;

            if (isPossible(piles,h,mid)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return ans;
    }

    public static boolean isPossible(int[] piles, int h, int mid){

        System.out.println("Mid is " + mid);

        for (int x : piles){

        h-= (int)Math.ceil((double) x/mid);
            if (h<0)return false;
        }

        return true;
    }

}

package com.CodeHelp.Extra;

/*
https://leetcode.com/problems/can-place-flowers/description/
 */
public class E33_CanPlaceFlowers_LEETCODE {

    public static void main(String[] args) {
        int[] flower1 = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(flower1,1));
        int[] flower2 = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(flower2,2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            boolean left = i==0 || flowerbed[i-1] == 0;
            boolean right = i==flowerbed.length-1 || flowerbed[i+1] == 0;

            if (left && right && flowerbed[i]==0){
                flowerbed[i] = 1;
                n--;
            }


        }
        return n<=0;
    }
}

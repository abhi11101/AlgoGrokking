package com.CodeHelp.C13_Heap;

import java.util.Collections;
import java.util.PriorityQueue;

/*
https://leetcode.com/problems/remove-stones-to-minimize-the-total/
 */
public class C15_RemoveStonesToMinimizeTheTotal_LEETCODE {

    public static void main(String[] args) {

        int[] piles1 = {5,4,9};
        System.out.println(minStoneSum(piles1,2));

        int[] piles2 ={4,3,6,7};
        System.out.println(minStoneSum(piles2,3));

    }

    public static int minStoneSum(int[] piles, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < piles.length; i++) {
            maxHeap.add(piles[i]);
        }

        while(k>0){
            int element = maxHeap.poll();
            element -=element/2;
            maxHeap.add(element);
            k--;
        }

        int ans = 0;
        while (!maxHeap.isEmpty()){
            ans+=maxHeap.poll();
        }

        return ans;
    }

}

package com.CodeHelp.C13_Heap;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/*
https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/description/
 */
public class C14_SmallestRangeCoveringElementsFromKLists_LEETCODE {

    public static void main(String[] args) {

        List<List<Integer>> list = List.of(List.of(4,10,15,24,26), List.of(0,9,12,20),List.of(5,18,22,30));

        int[] ans = smallestRange(list);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] smallestRange(List<List<Integer>> nums) {

        PriorityQueue<C14_HeapInfo> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.value));

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i =0;i<nums.size();i++){
            int element = nums.get(i).get(0);
            min = Math.min(min,element);
            max = Math.max(max,element);
            C14_HeapInfo info = new C14_HeapInfo(element,i,0);
            minHeap.add(info);
        }

        int ansMin = min;
        int ansMax = max;

        while (!minHeap.isEmpty()){

            C14_HeapInfo info = minHeap.poll();
            int value = info.value;
            int row = info.row;
            int col = info.col;


            min = value;

            int currentRange = max-min;
            int ansRange = ansMax-ansMin;

            if (currentRange<ansRange){
                ansMin = min;
                ansMax = max;
            }

            if (col+1 < nums.get(row).size()){
                int element = nums.get(row).get(col+1);
                C14_HeapInfo newInfo = new C14_HeapInfo(element,row,col+1);
                minHeap.add(newInfo);
                max = Math.max(max,element);
            }else{
                break;
            }

        }

        return new int[]{ansMin,ansMax};
    }

}

class C14_HeapInfo{

    int value;
    int row;
    int col;

    public C14_HeapInfo(int value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
    }
}
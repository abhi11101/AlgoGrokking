package com.CodeHelp.C13_Heap;

import java.util.PriorityQueue;

/*
https://leetcode.com/problems/longest-happy-string/
 */
public class C17_LongestHappyString_LEETCODE {

    public static void main(String[] args) {

        System.out.println(longestDiverseString(1,1,7));
        System.out.println(longestDiverseString(7,1,0));
    }

    public static String longestDiverseString(int a, int b, int c) {

        PriorityQueue<C17_HeapInfo> maxHeap = new PriorityQueue<>((x,y) -> y.count-x.count);

        if (a>0){
            C17_HeapInfo info = new C17_HeapInfo('a',a);
            maxHeap.add(info);
        }
        if (b>0){
            C17_HeapInfo info = new C17_HeapInfo('b',b);
            maxHeap.add(info);
        }
        if (c>0){
            C17_HeapInfo info = new C17_HeapInfo('c',c);
            maxHeap.add(info);
        }

        StringBuilder ans =new StringBuilder();
        while (maxHeap.size()>1){

            C17_HeapInfo first = maxHeap.poll();
            C17_HeapInfo second = maxHeap.poll();

            if (first.count>=2){
                ans.append(first.data);
                ans.append(first.data);
                first.count-=2;
            }else{
                ans.append(first.data);
                first.count-=1;
            }

            if (second.count>=2 && second.count>=first.count){
                ans.append(second.data);
                ans.append(second.data);
                second.count-=2;
            }else{
                ans.append(second.data);
                second.count-=1;
            }

            if (first.count>0)maxHeap.add(first);
            if (second.count>0)maxHeap.add(second);

        }

        if (maxHeap.size()>0){
            C17_HeapInfo info = maxHeap.poll();

            if (info.count>=2){
                ans.append(info.data);
                ans.append(info.data);
                info.count-=2;
            }else{
                ans.append(info.data);
                info.count-=1;
            }
        }

        return ans.toString();
    }
}

class C17_HeapInfo{

    char data;
    int count;

    public C17_HeapInfo(char data, int count) {
        this.data = data;
        this.count = count;
    }
}
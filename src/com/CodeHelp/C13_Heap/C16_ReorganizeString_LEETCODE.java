package com.CodeHelp.C13_Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
https://leetcode.com/problems/reorganize-string/
 */
public class C16_ReorganizeString_LEETCODE {

    public static void main(String[] args) {

        System.out.println(reorganizeString("aab"));
        System.out.println(reorganizeString("aaab"));
    }

    public static String reorganizeString(String s) {

        PriorityQueue<C16_HeapInfo> maxHeap = new PriorityQueue<>((a,b) -> b.count-a.count);

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                C16_HeapInfo info = new C16_HeapInfo((char)(i+'a'), freq[i]);
                maxHeap.add(info);
            }
        }
        System.out.println(maxHeap);


        StringBuilder ans = new StringBuilder();
        while (maxHeap.size() > 1) {

            C16_HeapInfo first = maxHeap.poll();
            C16_HeapInfo second =maxHeap.poll();

            char firstChar = first.data;
            char secondChar = second.data;

            ans.append(firstChar);
            ans.append(secondChar);

            first.count--;
            second.count--;

            if (first.count!=0){
                maxHeap.add(first);
            }
            if (second.count!=0){
                maxHeap.add(second);
            }

        }

        if (maxHeap.size()==1){

            C16_HeapInfo info = maxHeap.poll();
            if (info.count!=1)return "";
            ans.append(info.data);
        }
        return ans.toString();
    }

}

class C16_HeapInfo{

    char data;
    int count;

    public C16_HeapInfo(char data, int count) {
        this.data = data;
        this.count = count;
    }

    @Override
    public String toString() {
        return "C16_HeapInfo{" +
                "data=" + data +
                ", count=" + count +
                '}';
    }
}
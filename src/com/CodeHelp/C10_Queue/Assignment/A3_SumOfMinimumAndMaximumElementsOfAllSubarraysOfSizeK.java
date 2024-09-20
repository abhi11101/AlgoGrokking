package com.CodeHelp.C10_Queue.Assignment;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class A3_SumOfMinimumAndMaximumElementsOfAllSubarraysOfSizeK {

    public static void main(String[] args) {

        int[] arr = {2, 5, -1, 7, -3, -1, -2};

        int sum  = sumOfMinimumAndMaximum(arr, 4);
        System.out.println(sum);
    }

    public static int sumOfMinimumAndMaximum(int[] arr, int k) {

        Deque<Integer> maxQueue = new LinkedList<>();
        Deque<Integer> minQueue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        int index =0;

        while (index < k){

            while (!maxQueue.isEmpty() && arr[index]>= arr[maxQueue.peekLast()]){
                maxQueue.pollLast();
            }

            while (!minQueue.isEmpty() && arr[index]<= arr[minQueue.peekLast()]){
                minQueue.pollLast();
            }

            maxQueue.add(index);
            minQueue.add(index);
            index++;
        }

        int sum = arr[maxQueue.peek()] + arr[minQueue.peek()];
        ans.add(sum);

        System.out.println(ans);

        while (index < arr.length){

            if (!maxQueue.isEmpty() && (index - maxQueue.peek())>=k){
                maxQueue.poll();
            }

            if (!minQueue.isEmpty() && (index - minQueue.peek())>=k){
                minQueue.poll();
            }

            while (!maxQueue.isEmpty() && arr[index]>=arr[maxQueue.peekLast()]){
                maxQueue.pollLast();
            }

            while (!minQueue.isEmpty() && arr[index]<=arr[minQueue.peekLast()]){
                minQueue.pollLast();
            }

            maxQueue.add(index);
            minQueue.add(index);

            sum = arr[maxQueue.peek()] + arr[minQueue.peek()];
            ans.add(sum);
            index++;
        }
        System.out.println(ans);
        sum =0;
        for (int x : ans){
            sum+=x;
        }
        return sum;
    }

}

package com.CodeHelp.C10_Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C7_FirstNegativeInEveryWindowOfSizeK {

    public static void main(String[] args) {

        long[] A = {-8, 2, 3, -6, 10};
        int[] data = {-8, 2, 3, -6, 10};
        long[] ans = printFirstNegativeInteger(A,5,2);
        printArray(ans);

        List<Integer> res = faster(data,5,2);
        System.out.println(res);

        int[] data2 = {12, -1, -7, 8, -15, 30, 16, 28};
        List<Integer> res2 = faster(data2,8,3);
        System.out.println(res2);
    }

    public static List<Integer> faster(int[] A, int N, int K){

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> ans = new LinkedList<>();

        for (int i = 0; i < K; i++) {
            if (A[i]<0){
                queue.add(i);
            }
        }

        if (queue.isEmpty()){
            ans.add(0);
        }else{
            ans.add(A[queue.peek()]);
        }

        for (int i = K; i <N; i++){

            while (!queue.isEmpty() && (i - queue.peek())>=K){
                queue.poll();
            }

            if (A[i]<0){
                queue.add(i);
            }

            if (queue.isEmpty()){
                ans.add(0);
            }else{
                ans.add(A[queue.peek()]);
            }
        }

        return ans;
    }

    public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        int index = 0;
        Queue<Long> ans = new LinkedList<>();
        Queue<Long> queue = new LinkedList<Long>();

        while (index < K){
            queue.add(A[index]);
            index++;
        }

        long element = firstNegative(queue);
        ans.add(element);


        while (index < N){

            queue.poll();
            long newElement = A[index];
            queue.add(newElement);

            long val  = firstNegative(queue);
            ans.add(val);
            index++;

        }

        long[] res = new long[ans.size()];

        int mainIndex = 0;
        while (!ans.isEmpty()){
            res[mainIndex] = ans.poll();
            mainIndex++;
        }
        return res;
    }

    public static long firstNegative(Queue<Long> queue){

        for (long x : queue){
            if (x < 0)return x;
        }
        return 0;
    }

    public static void printArray(long[] A){

        for (long x : A){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void printList(List<Integer> list){
        for (Integer x : list){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void printQueue(Queue<Long> queue){

        for (long x : queue){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

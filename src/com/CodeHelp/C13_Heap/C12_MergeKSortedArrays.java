package com.CodeHelp.C13_Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class C12_MergeKSortedArrays {

    public static void main(String[] args) {


    }

    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K)
    {
        PriorityQueue<C12_Info>  minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.data));

        for (int i=0;i<K;i++){

            C12_Info info = new C12_Info(arr[i][0],i,0);
            minHeap.add(info );
        }

        ArrayList<Integer> res = new ArrayList<>();

        while (!minHeap.isEmpty()){

            C12_Info info = minHeap.poll();
            int data = info.data;
            int row = info.row;
            int col = info.col;

            res.add(data);

            if (col+1<arr.length){
                C12_Info newInfo = new C12_Info(arr[row][col+1],row,col+1);
                minHeap.add(newInfo);
            }
        }

        return res;
    }
}

class C12_Info{

    int data;
    int row;
    int col;

    public C12_Info(int data, int row, int col) {
        this.data = data;
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Info{" +
                "data=" + data +
                ", row=" + row +
                ", col=" + col +
                '}';
    }
}
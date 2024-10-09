package com.CodeHelp.C13_Heap.Assignment;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
https://leetcode.com/problems/k-closest-points-to-origin/
 */
public class A1_KClosestPointsToOrigin_LEETCODE {

    public static void main(String[] args) {

        int[][] points = {{1,3},{-2,2}};
        int[][] ans = kClosest(points, 1);
        printMatrix(ans);
    }

    public static int[][] kClosest(int[][] points, int k) {

        PriorityQueue<A1_HeapInfo> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.distance));

        for (int i = 0; i < points.length; i++) {

            int x = points[i][0];
            int y = points[i][1];

            int distance = x*x + y*y;
            int[] arr = {x,y};

            A1_HeapInfo info = new A1_HeapInfo(arr, distance);
            minHeap.add(info);

        }

        int[][] result = new int[k][2];

        while (k>0){

            A1_HeapInfo info = minHeap.poll();
            int[] point = info.points;
            result[k-1] = point;
            k--;
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

class A1_HeapInfo{

    int[] points;
    int distance;

    public A1_HeapInfo(int[] points, int distance) {
        this.points = points;
        this.distance = distance;
    }
}
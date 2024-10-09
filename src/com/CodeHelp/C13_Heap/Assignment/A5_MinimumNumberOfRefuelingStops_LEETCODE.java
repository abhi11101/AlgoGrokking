package com.CodeHelp.C13_Heap.Assignment;

import java.util.PriorityQueue;

/*
https://leetcode.com/problems/minimum-number-of-refueling-stops/
 */
public class A5_MinimumNumberOfRefuelingStops_LEETCODE {

    public static void main(String[] args) {

        int[][] stations = {{10,60},{20,30},{30,30},{60,40}};
        System.out.println(minRefuelStops(100,10,stations));

    }

    public static int minRefuelStops(int target, int startFuel, int[][] stations) {

        int stops =0;
        int currentDistance = 0;
        int index =0;
        int currentFuel = startFuel;
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->b[1]-a[1]);

        while (true){

            while (index<stations.length){

                if (stations[index][0]<=currentDistance+currentFuel){
                    int[] points = stations[index];
                    maxHeap.add(points);
                }else break;
                index++;
            }

            currentDistance+=currentFuel;

            if (currentDistance>=target)break;

            if(maxHeap.isEmpty())return -1;

            int[] maxFuel = maxHeap.poll();
            currentFuel = currentDistance-maxFuel[0];
            currentFuel += maxFuel[1];
            currentDistance=maxFuel[0];
            stops++;

        }

        return stops;
    }

}

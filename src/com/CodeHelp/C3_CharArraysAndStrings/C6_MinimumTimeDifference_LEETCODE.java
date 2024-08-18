package com.CodeHelp.C3_CharArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://leetcode.com/problems/minimum-time-difference/description/
 */
public class C6_MinimumTimeDifference_LEETCODE {

    public static void main(String[] args) {

        List<String> timePoints = List.of("12:10","10:15","13:15","17:20","18:00","19:47","23:59");
        List<String> list2 = List.of("23:59","00:00");
        List<String> list3 = List.of("00:00","23:59","00:00");

        System.out.println(findMinDifference(list2));

    }

    public static int findMinDifference(List<String> timePoints) {

        int[] minArray  = new int[timePoints.size()];
        int index =0;
        int minTime =Integer.MAX_VALUE;
        for (String time : timePoints) {

            int minutes = Integer.parseInt(time.split(":")[0])*60 + Integer.parseInt(time.split(":")[1]);
            System.out.println(minutes);
            minArray[index]=minutes;
            index++;
        }
        Arrays.sort(minArray);

        for (int i =1;i<minArray.length;i++){
            int diff = minArray[i]-minArray[i-1];
            if (diff<minTime){
                minTime= diff;
            }
        }

        int lastDiff = (minArray[0]+1440) - minArray[minArray.length-1];

        return minTime<lastDiff?minTime:lastDiff;

    }


}

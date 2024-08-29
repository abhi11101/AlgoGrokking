package com.CodeHelp.C5_RecursionAndBacktracking.Assignment;

/*

 */
public class A12_MinimumCostForTickets_LEETCODE {

    public static void main(String[] args) {

        int[] days = {1,4,6,7,8,20};
        int[] costs = {2,7,15};

        System.out.println(mincostTickets(days, costs));

    }

    public static int mincostTickets(int[] days, int[] costs) {

        return helper(days,costs,0);
    }

    public static int helper(int[] days, int[] costs, int index) {

        if (index >= days.length) {
            return 0;
        }

        int cost1 = costs[0] + helper(days,costs,index+1);


        int passEndDay = days[index] + 7 - 1;
        int j = index;

        while (j<days.length && days[j]<=passEndDay){
            j++;
        }

        int cost7 = costs[1] + helper(days,costs,j);


        passEndDay = days[index] + 30 -1 ;
        j= index;

        while (j<days.length && days[j]<=passEndDay){
            j++;
        }

        int cost30 = costs[2] + helper(days,costs,j);

        return Math.min(cost1, Math.min(cost30,cost7));

    }

}

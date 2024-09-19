package com.CodeHelp.C10_Queue;

/*
https://leetcode.com/problems/gas-station/
 */
public class C9_GasStation_LEETCODE {

    public static void main(String[] args) {

        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        System.out.println(canCompleteCircuit(gas,cost));

        int[] gas2 = {2,3,4};
        int[] cost2 = {3,4,3};
        System.out.println(canCompleteCircuit(gas2,cost2));

    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int start =0;
        int balance =0;
        int deficit = 0;

        for (int i = 0; i < gas.length; i++) {

            balance+= gas[i] - cost[i];

            if (balance<0){
                deficit += balance;
                start = i+1;
                balance = 0;
            }

        }
        System.out.println("Balance " + balance);
        System.out.println("Deficit " + deficit);
        if (balance+ deficit >=0)return start;

        return -1;
    }

}

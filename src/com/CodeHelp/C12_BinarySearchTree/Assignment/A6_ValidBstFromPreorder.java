package com.CodeHelp.C12_BinarySearchTree.Assignment;

import java.util.ArrayList;

public class A6_ValidBstFromPreorder {

    public static void main(String[] args) {

        int[] pre1= {7, 7, 10, 10, 9, 5, 2, 8};
        int[] pre2 = {10,8,7,9,20,21,15};
        int[] pre3 = {10,8,7,9,20,15,21};

        ArrayList<Integer> first = createList(pre1);
        ArrayList<Integer> second = createList(pre2);
        ArrayList<Integer> third = createList(pre3);


        System.out.println(solve(first));
        System.out.println(solve(second));
        System.out.println(solve(third));
    }

    public static int solve(ArrayList<Integer> A) {

        int[] index = {0};

        validBst(A,Integer.MIN_VALUE,Integer.MAX_VALUE,index);

        int ans = index[0]==A.size() ? 1 : 0;

        return ans;
    }

    public static void validBst(ArrayList<Integer> list , int lowerBound, int upperBound, int[] index) {

        if (index[0]>=list.size() || (list.get(index[0])<=lowerBound || list.get(index[0])>=upperBound)) {
            return ;
        }

        int element = list.get(index[0]);
        index[0]++;

        validBst(list, lowerBound, element, index);
        validBst(list,element,upperBound,index);

    }

    public static ArrayList<Integer> createList(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        for (int x : arr){
            list.add(x);
        }

        return list;
    }

}

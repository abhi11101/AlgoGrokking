package com.CodeHelp.C1_Arrays;

import java.util.ArrayList;
import java.util.List;

public class C5_Union {

    public static void main(String[] args) {


    }

    private static void unionBruteForce(int[] a, int[] b) {


    }

    private static int[] intersection(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    b[i] = Integer.MIN_VALUE;
                    list.add(a[i]);
                }
            }
            int res[] = {};
            for (int num : list) {

            }

        }
        return a;
    }
}
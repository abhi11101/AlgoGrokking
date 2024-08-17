package com.CodeHelp.Extra;

import java.util.HashMap;

public class E9_CountSubArraysEqualNoOfOneZero {

    public static void main(String[] args) {

        int[] arr = {1,0,1,0,1};
        System.out.println(countSubArrays(arr));
    }


    public static int countSubArrays(int[] arr) {

        int sum=0;
        int ans =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for (int x : arr){

            if (x==0){
                sum+=-1;
            }
            else {
                sum+=1;
            }

            if (map.containsKey(sum)){
                ans+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
            else {
                map.put(sum,1);
            }

        }
        return ans;

    }

}

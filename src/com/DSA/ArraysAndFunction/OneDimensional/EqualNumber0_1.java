package com.DSA.ArraysAndFunction.OneDimensional;

import java.util.HashMap;

public class EqualNumber0_1 {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1};
        find(arr);
    }

    public static void find(int arr[]){
        int sum=0;
        int ans=0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0)sum+=-1;
            else sum+=1;
            if (hashMap.containsKey(sum)){
                ans +=hashMap.get(sum);
                hashMap.put(sum,hashMap.get(sum)+1);
            }
            else {
                hashMap.put(sum,1);
            }
        }
        System.out.println(ans);
    }

}

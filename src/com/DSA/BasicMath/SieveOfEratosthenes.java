package com.DSA.BasicMath;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        check(5);
    }

    public static void check(int n){
     //   if(n==3) System.out.println("1");
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=prime[1]=false;
        int count=0;
        for (int i=2;i*i<=n;i++){
            if (prime[i]) {
                for (int j = 2 * i; j <= n; j = j + i) {
                    prime[j] = false;
                }
            }
        }

        for(int i=2;i<prime.length;i++){
            if (prime[i]) count++;
        }
        System.out.println(count);
    }
}

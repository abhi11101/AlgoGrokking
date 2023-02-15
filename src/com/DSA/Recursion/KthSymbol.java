package com.DSA.Recursion;

public class KthSymbol {
    public static void main(String[] args) {
           //better(30,434991989);
        System.out.println(better(3,4));
    }

    private static void find(int n , int k){ // TLE for case  find(30,434991989);
        String[] data = new String[n];
        data[0]="0";
        int i=1;
        int v= n;
        String res="";
        while (v>1){
            String fetch = data[i-1];

            for (int j =0;j<fetch.length();j++){
                char c = fetch.charAt(j);
                if (c=='0'){
                    res+="01";
                }
                if (c=='1'){
                    res+="10";
                }
            }
            data[i]=res;
            res="";
        //    System.out.println("data " + i + " "+data[i]);
            i++;
            v--;
        }
        res = ""+data[n-1].charAt(k-1);
        System.out.println(Integer.parseInt(res));
    }

    private static int better(int n, int k){
        if (n==1 || k==1)return 0;

        int mid = (int)Math.pow(2,n-1)/2;
        if (k<=mid){
            return better(n-1,k);
        }else {
            return ~better(n-1,k-mid);
        }
    }
}

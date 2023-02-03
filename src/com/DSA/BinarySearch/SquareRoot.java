package com.DSA.BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        root(7,3);
    }
    public static void root(int num, int precision){
        long start=0;
        long end=num;
        long  mid;
        long ans=0;
        while (start<=end){
            mid =start + (end-start)/2;
            if (mid*mid==num){
                System.out.println("Mid " +mid);
                ans=mid;
                break;
            }
            else if (mid*mid<num){start=mid+1;ans=mid;}
            else end=mid-1;
        }
        System.out.println("Ans "+ ans);
        double sol=ans;
        double factor=1;
        for (int i=0;i<precision;i++){
            factor=factor/10;
            System.out.println("Factor " + factor);
            for (double j=sol;j*j<num;j=j+factor){
                System.out.println("J " + j);
                sol=j;
                System.out.println("I " + i + " sol "+ sol);
            }
        }
        System.out.println("Res "+ sol);
    }
}

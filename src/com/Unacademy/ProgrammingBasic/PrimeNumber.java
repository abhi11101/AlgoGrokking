package com.Unacademy.ProgrammingBasic;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(61));
    }
    public static  String isPrime(int n){
        for (int i=2;i<n;i++){
            if (n%i==0)return "Not Prime";
        }
        return "Prime";
    }
}

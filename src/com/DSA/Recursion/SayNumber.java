package com.DSA.Recursion;

public class SayNumber {
    public static void main(String[] args) {
        say(9040087);
    }
    private static void say(int n){
        String[] data = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if (n==0){
            return;
        }
        say(n/10);
        System.out.print(data[n%10]+" ");

    }
}

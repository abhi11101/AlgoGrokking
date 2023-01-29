package com.DSA.ProgrammingBasic.Bitwise;

public class BitsTest {
    public static void main(String[] args) {
        System.out.println(evenOdd(6));
    }
    public static String evenOdd(int n){
        if ((n&1)==0)return "Even";
        else return "Odd";
    }
}

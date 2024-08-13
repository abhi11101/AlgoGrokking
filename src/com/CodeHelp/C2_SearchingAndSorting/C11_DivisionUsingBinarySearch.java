package com.CodeHelp.C2_SearchingAndSorting;

public class C11_DivisionUsingBinarySearch {

    public static void main(String[] args) {

        System.out.println(find(22,-7));

    }

    public static int find(int dividend, int divisor) {

        int start =0;
        int end = Math.abs(dividend);
        int mid;
        int result =-1;
        int product=0;

        while (start <= end) {

            mid = start + (end - start) / 2;

            product = mid*Math.abs(divisor);

            if (product == dividend) {
                return mid;
            }
            else if (product>dividend){
                end = mid - 1;
            }
            else {
                start = mid + 1;
                result = mid;
            }
        }
        if ((dividend>0 && divisor >0) || (dividend<0 && divisor<0)){
            return result;
        }
        else {
            return -result;
        }

    }

}

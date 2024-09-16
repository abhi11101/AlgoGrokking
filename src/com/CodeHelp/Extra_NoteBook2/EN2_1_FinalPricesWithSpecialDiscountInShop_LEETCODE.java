package com.CodeHelp.Extra_NoteBook2;

import java.util.Stack;

/*
https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/
 */
public class EN2_1_FinalPricesWithSpecialDiscountInShop_LEETCODE {

    public static void main(String[] args) {

        int[] prices =  {8,4,6,2,3};
        int[] prices2 = {1,2,3,4,5};
        int[] prices3 = {10,1,1,6};
        int[] ans = finalPrices(prices);
        printArray(ans);

        int[] ans2 = finalPrices(prices2);
        printArray(ans2);

        int[] ans3 = finalPrices(prices3);
        printArray(ans3);
    }

    public static int[] finalPrices(int[] prices) {

        int[] ans = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = prices.length - 1; i >= 0; i--) {
            int price = prices[i];
            int discount = 0;

            while (!stack.isEmpty()){
                if (stack.peek()<=price){
                    discount = stack.peek();
                    stack.push(price);
                    break;
                }else{
                    stack.pop();
                }
            }
            if (stack.isEmpty()){
                stack.push(price);
            }
            int finalPrice = price - discount;
            ans[i] = finalPrice;
        }

        return ans;
    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

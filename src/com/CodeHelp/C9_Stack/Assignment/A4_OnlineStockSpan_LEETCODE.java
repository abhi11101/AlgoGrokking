package com.CodeHelp.C9_Stack.Assignment;

import java.util.Stack;

/*
https://leetcode.com/problems/online-stock-span/description/
 */
public class A4_OnlineStockSpan_LEETCODE {

    public static void main(String[] args) {

        StockSpanner stock = new StockSpanner();

        System.out.println(stock.next(100));
        System.out.println(stock.next(80));
        System.out.println(stock.next(60));
        System.out.println(stock.next(70));
        System.out.println(stock.next(60));
        System.out.println(stock.next(75));
        System.out.println(stock.next(85));

    }
}

class StockSpanner {


    Stack<int[]> stack ;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {


        int ans = 1 ;
        while (!stack.isEmpty()){
            int[] pair = stack.peek();
            int prevPrice = pair[0];
            int prevCount = pair[1];

            if (prevPrice<=price){
                ans+=prevCount;
                stack.pop();
            }else{
                break;
            }
        }
        stack.push(new int[]{price,ans});
        return ans;
    }
}
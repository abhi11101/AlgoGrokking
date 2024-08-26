package com.CodeHelp.C5_RecursionAndBacktracking.Assignment;

/*

 */
public class A3_AddStrings_LEETCODE {

    public static void main(String[] args) {

        System.out.println(addStringsUsingRecursion("11","123"));
        System.out.println(addStringsUsingRecursion("999","999"));
        System.out.println("----------------");
        System.out.println(addStringsUsingLoop("11","123"));
        System.out.println(addStringsUsingLoop("999","999"));


    }

    public static String addStringsUsingLoop(String num1, String num2) {

       StringBuilder ans = new StringBuilder();
       int p1 = num1.length()-1;
       int p2 = num2.length()-1;
       int carry = 0;

       while (p1>=0 || p2>=0 || carry>0) {

           int n1 = p1>=0 ? num1.charAt(p1)-'0' : 0;
           int n2 = p2>=0 ? num2.charAt(p2)-'0' : 0;
           int sum = n1+n2+carry;
           ans.append(sum%10);
           carry = sum/10;

           p1--;
           p2--;
       }


        return ans.reverse().toString();

    }

    public static String addStringsUsingRecursion(String num1, String num2) {

        StringBuilder ans = new StringBuilder();

        addRe(num1,num1.length()-1,num2,num2.length()-1,0,ans);
        System.out.println("main ans = "+ans);
        return ans.reverse().toString();
    }

    public static void addRe(String num1, int p1, String num2, int p2, int carry, StringBuilder ans) {

        if (p1<0 && p2<0){

            if (carry!=0){
                ans.append(carry);
            }
            return ;

        }

        int n1 = p1>=0 ? num1.charAt(p1) -'0' : 0;
        int n2 = p2>=0 ? num2.charAt(p2) -'0' : 0 ;

        int sum = n1+n2+carry;
        int digit = sum%10;
        carry = sum/10;

        ans.append(digit);
        addRe(num1,p1-1,num2,p2-1,carry,ans);


    }


}

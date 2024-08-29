package com.CodeHelp.C5_RecursionAndBacktracking.Assignment;

/*

 */
public class A9_IntegerToEnglishWords_LEETCODE {

    private static final String[] underTwenty =  { "" , "One","Two","Three","Four","Five","Six","Seven","Eight","Nine"
                    ,"Ten","Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

    private static final String[] tens = {"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

    public static void main(String[] args) {

        System.out.println(numberToWords(913_978_768));
    }

    public static String numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
        return helper(num);
//        return indianHelper(num);
    }
    private static String helper(int num){
        StringBuilder res = new StringBuilder();

        if(num<20){
            res.append(underTwenty[num]);
        }
        else if(num<100){
            res.append(tens[num/10]).append(" ").append(underTwenty[num%10]);
        }
        else if(num<1000){
            res.append(helper(num/100)).append(" Hundred ").append(helper(num%100));
        }
        else if(num<1_000_000){
            res.append(helper(num/1000)).append(" Thousand ").append(helper(num%1000));
        }
        else if(num<1_000_000_000){
            res.append(helper(num/1_000_000)).append(" Million ").append(helper(num%1_000_000));
        }
        else {
            res.append(helper(num/1_000_000_000)).append(" Billion ").append(helper(num%1_000_000_000));
        }

        return res.toString().trim();
    }

    private static String indianHelper(int num){
        StringBuilder sb = new StringBuilder();
        if (num<20){
            sb.append(underTwenty[num]);
        }
        else if (num<100) {
            sb.append(tens[num/10]).append(" ").append(underTwenty[num%10]);
        }
        else if (num<1000) {
            sb.append(indianHelper(num/100)).append(" Hundred ").append(indianHelper(num%100));
        }
        else if (num<1_00_000) {
            sb.append(indianHelper(num/1000)).append(" Thousand ").append(indianHelper(num%1000));
        }
        else if (num<1_00_00_000){
            sb.append(indianHelper(num/100000)).append(" lakhs ").append(indianHelper(num%100000));
        }
        else if (num<1000000000){
            sb.append(indianHelper(num/10000000)).append(" crore ").append(indianHelper(num%10000000));
        }
        else {
            sb.append(indianHelper(num/1000000000)).append(" arab ").append(indianHelper(num%1000000000));
        }

        return sb.toString().trim();
    }


}

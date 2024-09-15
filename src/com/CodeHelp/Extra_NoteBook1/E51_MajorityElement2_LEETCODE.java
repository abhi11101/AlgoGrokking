package com.CodeHelp.Extra_NoteBook1;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/majority-element-ii/description/
 */
public class E51_MajorityElement2_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));

        int[] arr2 = {1,2};
        System.out.println(majorityElement(arr2));

    }

    public static List<Integer> majorityElement(int[] nums) {

        List<Integer> ans =new ArrayList<>();
        int num1= 0;
        int num2 = 0;

        int vote1=0;
        int vote2=0;

        for (int x : nums){

            if (x==num1){
                vote1++;
            }
            else if (x==num2){
                vote2++;
            }
            else if (vote1==0){
                num1=x;
                vote1++;
            }
            else if (vote2==0){
                num2=x;
                vote2++;
            }
            else{
                vote1--;
                vote2--;
            }
        }

        vote1 =0;
        vote2=0;

        for (int x : nums){
            if (x==num1){
                vote1++;
            }
            else if (x==num2){
                vote2++;
            }
        }

        int majority = nums.length/3;

        if (vote1>majority){
            ans.add(num1);
        }
        if (vote2>majority){
            ans.add(num2);
        }

        return ans;
    }


}

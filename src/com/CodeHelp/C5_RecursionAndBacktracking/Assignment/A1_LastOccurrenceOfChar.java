package com.CodeHelp.C5_RecursionAndBacktracking.Assignment;

public class A1_LastOccurrenceOfChar {

    public static void main(String[] args) {

        System.out.println(lastIndexLeftToRightTraversal("abcddedg",0,'d',-1));
        System.out.println(lastIndexLeftToRightTraversal("abcddedg",0,'g',-1));
        System.out.println(lastIndexLeftToRightTraversal("abcddedg",0,'q',-1));
        System.out.println("-------------------");
        System.out.println(lastIndexRightToLeftTraversal("abcddedg",7,'d',-1));
        System.out.println(lastIndexRightToLeftTraversal("abcddedg",7,'g',-1));
        System.out.println(lastIndexRightToLeftTraversal("abcddedg",7,'q',-1));
    }


    public static int lastIndexLeftToRightTraversal(String s, int index, char target, int ans){

        if (index == s.length()){
            return ans;
        }

        if (s.charAt(index) == target){
            ans = index;
        }

        return lastIndexLeftToRightTraversal(s, index+1, target, ans);

    }

    public static int lastIndexRightToLeftTraversal(String s, int index, char target, int ans){

        if (index <=0){
            return ans;
        }

        if (s.charAt(index) == target){
            return index;
        }

        return lastIndexLeftToRightTraversal(s, index-1, target, ans);

    }


}

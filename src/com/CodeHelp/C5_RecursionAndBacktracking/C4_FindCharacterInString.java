package com.CodeHelp.C5_RecursionAndBacktracking;

public class C4_FindCharacterInString {

    public static void main(String[] args) {

        System.out.println(findString("lovebabbar",0,'r'));


    }


    public static boolean findString(String s, int index, char target){

        if (index>=s.length()) return false;

        if (s.charAt(index)==target){
            return true;
        }
        else {
            return findString(s, index+1,target);
        }

    }

}

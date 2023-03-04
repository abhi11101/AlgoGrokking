package com.DSA.CharacterAndString.LeetCode;

public class AddingSpacesTotring_2109 {
    public static void main(String[] args) {
        int[] spaces = {1,5,7,9};
        String s = "icodeinpython";
      //  System.out.println(addSpaces(s,spaces));
        System.out.println(faster(s,spaces));
    }
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int index=0;
        for (int x : spaces){
            ans.append(s.substring(index,x)+" ");
            index=x;
        }
        ans.append(s.substring(index));
        return ans.toString();
    }
    public static String faster(String s, int[] spaces){
        char[] arr = new char[s.length()+spaces.length];
        int res = 0;
        //Res is keeping count of previous space. That's why we are adding res in below index
        for (int x : spaces){
            arr[x+res++]=' ';
        }
        for (int i=0,j=0;i<arr.length;i++){
            if (arr[i]!=' '){
                arr[i]=s.charAt(j++);
            }
        }
        return new String(arr);
    }
}

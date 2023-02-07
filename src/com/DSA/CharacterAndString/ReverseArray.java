package com.DSA.CharacterAndString;

public class ReverseArray {
    public static void main(String[] args) {
      char[] arr = {'A','B','H','I','J'};
      work(arr);
      String s = "12<\0>45";
        System.out.println(s.length());
      for (char c : arr){
          System.out.print(c +" ");
      }
    }

    public static void work(char[] arr){
        int i=0;
        int j=arr.length-1;
        for ( ;i<arr.length/2;i++,j--){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}

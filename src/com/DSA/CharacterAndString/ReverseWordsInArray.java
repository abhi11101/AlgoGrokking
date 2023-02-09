package com.DSA.CharacterAndString;

public class ReverseWordsInArray {
    public static void main(String[] args) {
        char[] data = {'m','y',' ','n','a','m','e',' ','i','s',' ','a','b','h','i'};
        reverse(data);
        for (char c : data){
            System.out.print(c + " ");
        }
    }

    public static void reverse(char[] data){
        int start=0;
        int end=0;
        for (int i=0;i<data.length;i++){
            if (data[i]== ' '){
                end=i-1;
                swap(data,start,end);
                start=i+1;
            }
            if (i==data.length-1){

                swap(data,start,data.length-1);
            }
        }
    }
    public static void swap(char[] data,int start,int end){
        while (start<end){
            char temp=data[start];
            data[start++]=data[end];
            data[end--]=temp;

        }
    }
}

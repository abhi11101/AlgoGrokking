package com.abhi.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int list[] = {1,2,3,4,15};
        int value = 2;
        System.out.println(binary_search(list,value));
    }

    public static String binary_search(int list[], int value){
        int low =0;
        int high= list.length-1;
        int mid;
        while (low<=high){
            mid=(low+high)/2;
            if (list[mid]==value){
                return Integer.toString(mid);
            }
            if (list[mid]<value){
                low = mid+1;
            }
            else high=mid-1;
        }
        return null;
    }

}

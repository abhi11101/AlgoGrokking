package com.Unacademy.ArraysAndFunction;

public class Union_Intersaction {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2};
        int arr2[] = {5,5,2,2};
        union(arr,arr2);
        int res[]= intersection(arr,arr2);
        for (int x : res){
            System.out.print(x + " ");
        }
    }

    public static void union(int arr[], int arr2[]){
        int unq_arr1[] = new int[arr.length];
        int unq_arr2[] = new int[arr2.length];
        int index =0;
        for (int x : arr){
            boolean same = false;
            for (int y : unq_arr1){
                if (y==x){
                    same =true;
                    break;
                }
            }
            if (same==false){
                unq_arr1[index] =x;
                index++;
                System.out.print(x + " ");
            }
        }
        index=0;
        for (int x : arr2){
            boolean same = false;
            for (int y  :unq_arr2){
                if (y==x){
                    same = true;
                    break;
                }
            }
            if (same==false){
                unq_arr2[index] = x;
                index++;
            }
        }
        for (int x : unq_arr2){
            boolean same=false;
                    for (int y : unq_arr1){
                        if (y ==x){
                            same = true;
                    break;
                }
            }
            if (same ==false){
                System.out.print(x + " ");
            }
        }
        System.out.println();

    }
   public static int[] intersection(int arr[],int arr2[]){
       int res=0;
       int index =0;
       int inter[] = new int[arr.length > arr2.length ? arr.length : arr2.length];
        for (int x : arr){
         boolean same = false;
            for (int y : arr2){
                if (x==y) {
                    same =true;
                    break;
                }
            }
            for (int z : inter){
                if (x==z) {
                    same = false;
                    break;
                }
            }
            if (same==true){
                inter[index] = x;
                index++;
                res++;
                System.out.print(x + " ");
            }
        }
        if (res==0) System.out.println("Nothing Common");
       System.out.println();
       return inter;
   }
}

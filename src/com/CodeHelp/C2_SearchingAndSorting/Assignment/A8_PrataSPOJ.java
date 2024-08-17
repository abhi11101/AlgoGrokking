package com.CodeHelp.C2_SearchingAndSorting.Assignment;

public class A8_PrataSPOJ {

    public static void main(String[] args) {

        int[] ranks1 = {1,2,3,4};
        int prata1 = 10;
        int[] ranks2 = {1,1,1,1,1,1,1,1};
        int prata2 = 8;
        System.out.println(searchTimeToCompleteOrder(ranks1,prata1));


    }

    public static int searchTimeToCompleteOrder(int[] ranks, int pratas){

        int start = 0;
        int end =0;
        int highestRank=0;
        for (int x : ranks){
            if (x>highestRank)highestRank=x;
        }

        end = highestRank*(pratas*(pratas+1))/2;
        System.out.println("End " + end);
        int mid;
        int ans =-1;
        while (start<=end){

            mid = start + (end-start)/2;
            System.out.println("Mid " + mid);
            if (isPossible(ranks,pratas,mid)){
                ans=mid;
                end = mid-1;
            }
            else {
                start=mid+1;
            }
            System.out.println("Ans " + ans);
            System.out.println("-------------------");
        }

        return ans;
    }

    public static boolean isPossible(int[] ranks, int pratas, int mid){

        int cookedPrata =0;

        for (int i =0; i<ranks.length; i++){
            System.out.println("FOR--------------------");
            int R = ranks[i];
            int j =1;
            int timeTaken =0;
            int count =0;
            while (j<=pratas){
                count++;
                System.out.println("count " + count);
                if (timeTaken+(j*R)<=mid){
                    cookedPrata++;
                    timeTaken+= j*R;
                    j++;
                }
                else {
                    break;
                }
            }
            if (cookedPrata>=pratas){
                return true;
            }
        }
        return false;
    }

}

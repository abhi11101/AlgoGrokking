package com.CodeHelp.C2_SearchingAndSorting.Assignment;

public class A4_BookAllocation {

    public static void main(String[] args) {

        int[] books = {12, 34, 67, 90};
        int[] books2 = {15, 17, 20};
        System.out.println(allocate(books,1));

    }

    public static int allocate(int[] books, int students){

        int start =0;
        int end =0;
        int mid;
        int ans =-1;
        if (students>books.length)return ans;
        for (int book : books) {
            end+=book;
        }

        while (start<=end){

            mid = start+(end-start)/2;

            if (isPossible(books,students,books.length,mid)){
                ans =mid;
                end = mid-1;
            }else {
                start = mid+1;
            }


        }
        return ans;

    }

    public  static boolean isPossible(int[] books, int students, int noOfBooks, int mid){

        int studentCount = 1;
        int sum=0;

        for (int i =0;i<noOfBooks;i++){

            if ((books[i]+sum) <=mid){
                sum+=books[i];
            }
            else {
                studentCount++;
                if (studentCount>students || books[i]>mid){
                    return false;
                }
                sum=books[i];
            }
        }
        return true;

    }


}

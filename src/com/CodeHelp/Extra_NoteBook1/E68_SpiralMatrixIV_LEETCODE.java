package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/spiral-matrix-iv/
 */
public class E68_SpiralMatrixIV_LEETCODE {

    public static void main(String[] args) {

        E68_ListNode head = new E68_ListNode(3);
        E68_ListNode second = new E68_ListNode(0);
        E68_ListNode third = new E68_ListNode(2);
        E68_ListNode fourth = new E68_ListNode(6);
        E68_ListNode fifth = new E68_ListNode(8);
        E68_ListNode sixth = new E68_ListNode(1);
        E68_ListNode seventh = new E68_ListNode(7);
        E68_ListNode eighth = new E68_ListNode(9);
        E68_ListNode ninth = new E68_ListNode(4);
        E68_ListNode tenth = new E68_ListNode(2);
        E68_ListNode eleventh = new E68_ListNode(5);
        E68_ListNode twentyth = new E68_ListNode(5);
        E68_ListNode thirteenth = new E68_ListNode(0);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        eighth.next = ninth;
        ninth.next = tenth;
        tenth.next = eleventh;
        eleventh.next = twentyth;
        twentyth.next = thirteenth;

        printList(head);

        int[][] ans = spiralMatrix(3,5,head);
        printMatrix(ans);
    }

    public static int[][] spiralMatrix(int m, int n, E68_ListNode head) {

        int[][] matrix = new int[m][n];

        int startRow =0;
        int endRow = m-1;
        int startCol =0;
        int endCol = n-1;
        int totalElements = m*n;
        int val=0;
        E68_ListNode temp = head;

        while (startRow<=endRow && startCol<=endCol && totalElements>0){

            //LeftToRight
            for (int i = startCol;i<=endCol && totalElements>0;i++){

                if (temp!=null){
                    val = temp.val;
                    temp = temp.next;
                }else {
                    val = -1;
                }
                matrix[startRow][i] = val;
                totalElements--;

            }
            startRow++;
            printMatrix(matrix);

            //TopToBottom
            for (int i =  startRow; i<=endRow && totalElements>0;i++){

                if (temp!=null){
                    val = temp.val;
                    temp = temp.next;
                }else {
                    val = -1;
                }
                matrix[i][endCol] = val;
                totalElements--;
            }
            endCol--;
            printMatrix(matrix);

            //RightToLeft
            for (int i = endCol; i>=startCol && totalElements>0;i--){

                if (temp!=null){
                    val = temp.val;
                    temp = temp.next;
                }else {
                    val = -1;
                }
                matrix[endRow][i] = val;
                totalElements--;
            }
            endRow--;
            printMatrix(matrix);

            //BottomToTop
            for (int i = endRow; i>=startRow && totalElements>0;i--){
                if (temp!=null){
                    val = temp.val;
                    temp = temp.next;
                }else {
                    val = -1;
                }
                matrix[i][startCol] = val;
                totalElements--;
            }
            startCol++;
            printMatrix(matrix);

        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printList(E68_ListNode head){

        E68_ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class E68_ListNode{
    int val;
    E68_ListNode next;
    public E68_ListNode(int val) {
        this.val = val;
    }
    E68_ListNode(int val, E68_ListNode next) {
        this.val = val;
        this.next = next;
    }
}

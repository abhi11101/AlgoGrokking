package com.CodeHelp.C13_Heap;

import java.util.ArrayList;
import java.util.List;

public class C2_HeapDeletion {

    public static void main(String[] args) {

        C2_Heap heap = new C2_Heap();
        heap.insertMaxHeap(100);
        heap.insertMaxHeap(50);
        heap.insertMaxHeap(60);
        heap.insertMaxHeap(40);
        heap.insertMaxHeap(45);

        System.out.println(heap.list);

        heap.deletion();
        System.out.println(heap.list);
    }


}

class C2_Heap{

    List<Integer> list;
    int size;

    C2_Heap(){
        list = new ArrayList<Integer>();
        list.add(-1);
        size =0;
    }

    void deletion(){

        list.set(1,list.get(size));
        list.removeLast();
        size--;

        int index =1;
        while (index<size){

            int left = 2*index;
            int right = 2*index+1;

            int largestIndex = index;

            if (left<size && list.get(largestIndex)<list.get(left)){
                largestIndex = left;
            }
            if (right<size && list.get(largestIndex)<list.get(right)){
                largestIndex = right;
            }
            if (largestIndex!=index){

                int temp = list.get(largestIndex);
                list.set(largestIndex, list.get(index));
                list.set(index, temp);

                index = largestIndex;

            }else{
                break;
            }
        }


    }

    void insertMaxHeap(int value){

        size = size + 1;
        int index = size;
        list.add(index, value);


        while (index>1){

            int parentIndex = index/2;
            if (list.get(index)>list.get(parentIndex)){

                int temp = list.get(index);
                list.set(index, list.get(parentIndex));
                list.set(parentIndex, temp);

            }else{
                break;
            }

        }
    }

}

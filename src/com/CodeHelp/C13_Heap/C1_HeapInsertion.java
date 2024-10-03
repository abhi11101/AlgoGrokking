package com.CodeHelp.C13_Heap;

import java.util.ArrayList;
import java.util.List;

public class C1_HeapInsertion {

    public static void main(String[] args) {

        C1_Heap heap = new C1_Heap();
        heap.insertMaxHeap(100);
        heap.insertMaxHeap(50);
        heap.insertMaxHeap(60);
        heap.insertMaxHeap(40);
        heap.insertMaxHeap(45);

        System.out.println(heap.list);

    }

}

class C1_Heap{

    List<Integer> list;
    int size;
    C1_Heap(){
        list = new ArrayList<>();
        list.add(-1);
        size=0;
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

package com.CodeHelp.C14_HashMapAndTries.Assignment;

import java.util.Map;
import java.util.TreeMap;

public class A2_UnionOfTwoLinkedLists {

    public static void main(String[] args) {

        A2_TrieNode root = new A2_TrieNode(9);
        A2_TrieNode six = new A2_TrieNode(6);
        A2_TrieNode four = new A2_TrieNode(4);
        A2_TrieNode two = new A2_TrieNode(2);
        A2_TrieNode three = new A2_TrieNode(3);
        A2_TrieNode eight = new A2_TrieNode(8);

        root.next = six;
        six.next = four;
        four.next = two;
        two.next = three;
        three.next = eight;

        A2_TrieNode root2 = new A2_TrieNode(1);
        root2.next = new A2_TrieNode(2);
        root2.next.next = new A2_TrieNode(8);
        root2.next.next.next = new A2_TrieNode(6);
        root2.next.next.next.next = new A2_TrieNode(2);

        A2_TrieNode ans = findUnion(root, root2);

        printList(ans);
    }


    public static A2_TrieNode findUnion(A2_TrieNode head1, A2_TrieNode head2) {

        Map<Integer,A2_TrieNode> map = new TreeMap<>();

        A2_TrieNode temp = head1;
        while (temp!=null){

            int val = temp.data;
            A2_TrieNode next = temp.next;
            temp.next = null;
            if (!map.containsKey(val)){
                map.put(val,temp);
            }
            temp = next;
        }
        System.out.println(map);

        temp = head2;
        while (temp!=null){

            int val = temp.data;
            A2_TrieNode next = temp.next;
            temp.next = null;
            if (!map.containsKey(val)){
                map.put(val,temp);
            }
            temp = next;
        }
        System.out.println(map);
        A2_TrieNode head = new A2_TrieNode(-1);
        A2_TrieNode tail = head;
        for (A2_TrieNode node : map.values()){

            tail.next = node;
            tail = node;

        }
        return head.next;
    }

    public static void printList(A2_TrieNode root) {

        while (root!=null){
            System.out.print(root.data+" ");
            root = root.next;
        }
        System.out.println();

    }
}

class A2_TrieNode
{
    int data;
    A2_TrieNode next;
    A2_TrieNode(int d) {data = d; next = null; }

    @Override
    public String toString() {
        return "A2_TrieNode{" +
                "data=" + data  + "}";

    }
}
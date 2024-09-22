package com.CodeHelp.C11_Trees;

import java.util.*;

public class C21_BottomViewOfBinaryTree {

    public static void main(String[] args) {

        C21_TreeNode root = new C21_TreeNode(10);
        C21_TreeNode twenty = new C21_TreeNode(20);
        C21_TreeNode thirty = new C21_TreeNode(30);
        C21_TreeNode forty = new C21_TreeNode(40);
        C21_TreeNode fifty = new C21_TreeNode(50);
        C21_TreeNode sixty = new C21_TreeNode(60);
        C21_TreeNode seventy = new C21_TreeNode(70);
        C21_TreeNode eighty = new C21_TreeNode(80);
        C21_TreeNode ninety = new C21_TreeNode(90);
        C21_TreeNode hundred = new C21_TreeNode(100);

        root.left = twenty;
        root.right = fifty;

        twenty.left = thirty;
        twenty.right = forty;

        fifty.right = ninety;

        forty.left = sixty;
        forty.right = seventy;

        ninety.left = eighty;
        ninety.right = hundred;

        List<Integer> ans = bottomView(root);
        System.out.println(ans);

    }

    public static List<Integer> bottomView(C21_TreeNode root)
    {

        Map<Integer,Integer> map = new TreeMap<>();
        Queue<C21_Pair> queue = new LinkedList<>();
        queue.add(new C21_Pair(0,root));

        while (!queue.isEmpty()){

            C21_Pair temp = queue.poll();

            int hd = temp.horizontalDistance;
            C21_TreeNode curr = temp.root;

            map.put(hd,curr.val);

            if (curr.left != null){
                queue.add(new C21_Pair(hd-1,curr.left));
            }

            if (curr.right != null){
                queue.add(new C21_Pair(hd+1,curr.right));
            }

        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }

        return list;
    }


}

class C21_TreeNode {
    int val;
    C21_TreeNode left;
    C21_TreeNode right;
    C21_TreeNode() {}
    C21_TreeNode(int val) { this.val = val; }
    C21_TreeNode(int val, C21_TreeNode left, C21_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class C21_Pair{

    int horizontalDistance;
    C21_TreeNode root;

    C21_Pair(int horizontalDistance, C21_TreeNode root) {
        this.horizontalDistance = horizontalDistance;
        this.root = root;
    }

}

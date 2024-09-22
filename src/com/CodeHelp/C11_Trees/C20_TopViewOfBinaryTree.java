package com.CodeHelp.C11_Trees;

import java.util.*;

public class C20_TopViewOfBinaryTree {

    public static void main(String[] args) {

        C20_TreeNode root = new C20_TreeNode(10);
        C20_TreeNode twenty = new C20_TreeNode(20);
        C20_TreeNode thirty = new C20_TreeNode(30);
        C20_TreeNode forty = new C20_TreeNode(40);
        C20_TreeNode fifty = new C20_TreeNode(50);
        C20_TreeNode sixty = new C20_TreeNode(60);
        C20_TreeNode seventy = new C20_TreeNode(70);
        C20_TreeNode eighty = new C20_TreeNode(80);
        C20_TreeNode ninety = new C20_TreeNode(90);
        C20_TreeNode hundred = new C20_TreeNode(100);

        root.left = twenty;
        root.right = fifty;

        twenty.left = thirty;
        twenty.right = forty;

        fifty.right = ninety;

        forty.left = sixty;
        forty.right = seventy;

        ninety.left = eighty;
        ninety.right = hundred;

        List<Integer> ans = topView(root);
        System.out.println(ans);


    }

    public static List<Integer> topView(C20_TreeNode root) {

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<C20_Pair> queue = new LinkedList<>();
        queue.add(new C20_Pair(0,root));

        while (!queue.isEmpty()) {

            C20_Pair  temp = queue.poll();

            int hd = temp.horizontalDistance;
            C20_TreeNode currNode = temp.root;

            if (!map.containsKey(hd)) {
                map.put(hd,currNode.val);
            }

            if (currNode.left != null) {
                queue.add(new C20_Pair(hd-1,currNode.left));
            }
            if (currNode.right != null) {
                queue.add(new C20_Pair(hd+1,currNode.right));
            }

        }

        List<Integer> ans = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

}

class C20_TreeNode {
    int val;
    C20_TreeNode left;
    C20_TreeNode right;
    C20_TreeNode() {}
    C20_TreeNode(int val) { this.val = val; }
    C20_TreeNode(int val, C20_TreeNode left, C20_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class C20_Pair{

    int horizontalDistance;
    C20_TreeNode root;

    C20_Pair(int horizontalDistance, C20_TreeNode root) {
        this.horizontalDistance = horizontalDistance;
        this.root = root;
    }

}
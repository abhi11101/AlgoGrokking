package com.CodeHelp.C11_Trees;


import java.util.*;

public class C17_VerticalTreeTraversal {

    public static void main(String[] args) {

        C17_TreeNode root = new C17_TreeNode(1);
        C17_TreeNode two = new C17_TreeNode(2);
        C17_TreeNode three = new C17_TreeNode(3);
        C17_TreeNode four = new C17_TreeNode(4);
        C17_TreeNode five = new C17_TreeNode(5);
        C17_TreeNode six = new C17_TreeNode(6);
        C17_TreeNode seven = new C17_TreeNode(7);
        C17_TreeNode eight = new C17_TreeNode(8);
        C17_TreeNode nine = new C17_TreeNode(9);

        root.left = two;
        root.right = three;

        two.left = four;
        two.right = five;

        three.left = six;
        three.right = seven;

        six.right = eight;
        seven.right = nine;

        List<Integer> ans = verticalOrder(root);
        System.out.println(ans);

    }

    public static List<Integer> verticalOrder(C17_TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Map<Integer,List<Integer>> map = new TreeMap<>();
        Queue<C17_Pair> queue = new LinkedList<>();
        queue.add(new C17_Pair(0,root));

        while (!queue.isEmpty()) {

            C17_Pair temp = queue.poll();

            int hd = temp.horizontalDistance;
            C17_TreeNode curr = temp.node;

            if (!map.containsKey(hd)) {
                map.put(hd, new ArrayList<>());
            }
            map.get(hd).add(curr.val);

            if (curr.left != null) {
                queue.add(new C17_Pair(hd-1, curr.left));
            }
            if (curr.right != null) {
                queue.add(new C17_Pair(hd+1, curr.right));
            }

        }

        for (List<Integer> list : map.values()) {
            ans.addAll(list);
        }

        return ans;
    }

}

class C17_TreeNode {
    int val;
    C17_TreeNode left;
    C17_TreeNode right;
    C17_TreeNode() {}
    C17_TreeNode(int val) { this.val = val; }
    C17_TreeNode(int val, C17_TreeNode left, C17_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class C17_Pair{

    int horizontalDistance;
    C17_TreeNode node;

    C17_Pair(int horizontalDistance, C17_TreeNode node) {
        this.horizontalDistance = horizontalDistance;
        this.node = node;
    }

}

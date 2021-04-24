package com.atguigu.tree.Hot100Tree;

import java.util.Collections;

/**
 * 二叉树的最大路径和，存在负数
 */
public class Tree124 {
    static  int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(-2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(-4);
        TreeNode node5 = new TreeNode(-5);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.right = node5;
        maxPathSum(node1);
        System.out.println(max);
    }

    public static int maxPathSum(TreeNode root) {
        if (root==null) return 0;
        int leftSize=maxPathSum(root.left);
        int rightSize=maxPathSum(root.right);
//        int sum=leftSize+rightSize+root.value;
        int sum=Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(leftSize,rightSize),root.value),leftSize+rightSize),leftSize+root.value),rightSize+root.value),leftSize+rightSize+root.value);
        max=Math.max(max,sum);
        return sum;
//        Collections.addAll();
    }
}

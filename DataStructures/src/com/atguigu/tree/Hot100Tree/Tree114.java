package com.atguigu.tree.Hot100Tree;

import com.atguigu.tree.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TransferQueue;

/**
 * 二叉树转为列表
 */
public class Tree114 {
    public static LinkedList<TreeNode> list = new LinkedList();

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.right = node5;
//        getList(node1);
        getLinkedTree(node1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void getList(TreeNode root) {
        if (root == null) return;
        list.add(root);
        getList(root.left);
        getList(root.right);
    }

    public static void getLinkedTree(TreeNode root) {
        getList(root);
        if (list.size() < 2) return;
        list.poll();
        root.left = null;
        root.right = new TreeNode(list.poll().value);
        TreeNode temp = root.right;
        while (list.size() > 0) {
            temp.right = new TreeNode(list.poll().value);
            temp = temp.right;
        }
        System.out.println(root);
    }
}

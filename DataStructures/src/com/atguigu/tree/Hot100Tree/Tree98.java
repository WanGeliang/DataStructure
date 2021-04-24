package com.atguigu.tree.Hot100Tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 验证二叉搜索树
 */
public class Tree98 {
    public static void main(String[] args) {
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node9 = new TreeNode(9);
//        TreeNode node8 = new TreeNode(8);
//        TreeNode node10 = new TreeNode(10);
//        node6.left = node4;
//        node6.right = node9;
//        node4.left = node3;
//        node4.right = node5;
//        node9.left = node8;
//        node9.right = node10;
//        System.out.println(isSouSuoShu(node6));

        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(-11);
        TreeNode node3 = new TreeNode(2);
        node2.left = node1;
//        node2.right = node3;
//        isSouSuoShu(node2);
        System.out.println(isValidBST(node2));
        isValidBST(node2);
    }

    public static boolean isSouSuoShu(TreeNode root) {
        boolean flag1 = true, flag2 = false;
        if (root == null) return true;
        if (root.left != null && root.value > root.left.value) {
            flag1 = true;
            isSouSuoShu(root.left);
        }
        if (root.right != null && root.value < root.right.value) {
            flag2 = true;
            isSouSuoShu(root.right);
        }
        return flag1 && flag2;


    }

    /**
     * 笨方法
     *
     * @param root
     * @return
     */
    public static boolean isValidBST(TreeNode root) {
        if (list.size()==0) return false;
        long min=Long.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (!(min<list.get(i))){
                return false;
            }
        }
        return true;
    }

    static List<Integer> list = new LinkedList<>();

    public static void preOrder(TreeNode root) {
        if (root == null) return;
        preOrder(root.left);
        list.add(root.value);
        preOrder(root.right);
    }
}

package com.atguigu.tree.Hot100Tree;

/**
 * ��ת������
 */
public class Tree226 {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        root.left =invertTree(root.left);
        root.right=invertTree(root.right);
        return root;
    }
}

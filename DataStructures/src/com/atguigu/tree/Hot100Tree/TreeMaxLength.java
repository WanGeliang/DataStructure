package com.atguigu.tree.Hot100Tree;

public class TreeMaxLength {
    public static void main(String[] args) {

    }

    public static int getMaxLength(TreeNode root) {
        if (root == null) return 0;
        return Math.max(getMaxLength(root.left), getMaxLength(root.right)) + 1;
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

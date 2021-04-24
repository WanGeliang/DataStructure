package com.atguigu.tree.Hot100Tree;

/**
 * 二叉树的最大直径
 */
public class Tree504 {
    static int max = 0;

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
        System.out.println(node1);
        System.out.println(diameterOfBinaryTree(node1));
    }


    /**
     * 遍历每一个节点，以每一个节点为中心点计算最长路径（左子树边长+右子树边长），更新全局变量max。
     * 主要是更新每一个节点的两个子树深度的最大值
     * @param root
     * @return
     */
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        return max;
    }

    public static int dfs(TreeNode root) {
        if (root.left == null && root.right == null) return 0;
        int leftSize = root.left == null ? 0 : 1 + dfs(root.left);
        int rightSize = root.right == null ? 0 : 1 + dfs(root.right);
        max = Math.max(max, leftSize + rightSize);
        return Math.max(leftSize, rightSize);
    }
}


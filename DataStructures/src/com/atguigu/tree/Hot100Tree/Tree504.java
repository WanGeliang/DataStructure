package com.atguigu.tree.Hot100Tree;

/**
 * �����������ֱ��
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
     * ����ÿһ���ڵ㣬��ÿһ���ڵ�Ϊ���ĵ�����·�����������߳�+�������߳���������ȫ�ֱ���max��
     * ��Ҫ�Ǹ���ÿһ���ڵ������������ȵ����ֵ
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


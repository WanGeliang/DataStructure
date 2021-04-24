package com.atguigu.tree.ZuoShenTree;

public class MakeTree {
    public static void main(String[] args) {
        int[] pre = {1, 2, 5, 4, 6, 7, 3, 8, 9};
        int[] in = {5, 2, 6, 4, 7, 1, 8, 3, 9};
        TreeNode root = getHoleTree(pre, in);
        System.out.println(root);
    }

    public static TreeNode getHoleTree(int[] pre, int[] in) {
        return preInToTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public static TreeNode preInToTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd) return null;
        int value = pre[preStart];
        int index = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (value == in[i]) {
                index = i;
                break;
            }
        }
        TreeNode root = new TreeNode(value);
        int leftSize = index - inStart;//左边节点的个数
        root.left = preInToTree(pre, preStart + 1, preStart + leftSize, in, inStart, index - 1);
        root.right = preInToTree(pre, preStart + leftSize + 1, preEnd, in, index + 1, inEnd);
        return root;
    }
}

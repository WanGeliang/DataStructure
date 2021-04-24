package LeetCode;

import java.io.InputStream;

/**
 * 路径总和：根节点到叶子节点的和为sum
 */
public class leetcode_112 {
    public static void main(String[] args) {
//        new InputStream(System.in);
//        Integer.valueOf()
       int[]a= new int[]{1,1};
    }


    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        return getTF(root, sum);
    }

    public boolean getTF(TreeNode root, int sum) {
        if (root.val == sum) return true;
        if (root.left != null) return getTF(root.left, sum - root.val);
        if (root.right != null) return getTF(root.right, sum - root.val);
        return false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
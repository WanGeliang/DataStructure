package com.atguigu.tree.leecode;

public class Num_654 {
    public static void main(String[] args) {
        int[] nums={3,2,1,6,0,5};
        TreeNode treeNode = getMaxTreeNode(nums);
        System.out.println(treeNode);
    }

    public static TreeNode getMaxTreeNode(int[] nums){
        return getMain(nums,0,nums.length-1);
    }
    public static TreeNode getMain(int[] nums,int start,int end){
        if (start>end) return null;
        int Max_value=Integer.MIN_VALUE;
        int index=-1;
        for (int i = start; i <= end; i++) {
            if (nums[i]>Max_value){
                index=i;
                Max_value=nums[i];
            }
        }
        TreeNode root = new TreeNode(Max_value);
        root.left=getMain(nums,start,index-1);
        root.right=getMain(nums,index+1,end);
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
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
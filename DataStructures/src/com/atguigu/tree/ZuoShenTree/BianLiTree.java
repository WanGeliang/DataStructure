package com.atguigu.tree.ZuoShenTree;

import javax.management.ListenerNotFoundException;
import java.util.Stack;

//分别用递归和非递归的方式用三种方式遍历二叉树
//前中后序遍历
public class BianLiTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node4.right = node5;


//        System.out.println("前序遍历结果为：");
//        preOrderRecursion(root);
//        System.out.println();
//        System.out.println("中序遍历结果为：");
//        midOrderRecursion(root);
//        System.out.println();
//        System.out.println("后续遍历结果为：");
//        postOrderRecursion(root);


        System.out.println("前序遍历结果为：");
//        preOrderNoRecursion(root);
//        System.out.println();
//        System.out.println("zhong序遍历结果为：");
//        midOrderNoRecursion(root);
//        System.out.println();
//        System.out.println("非递归的方式的后序遍历结果为：");
//        postOrderNoRecursion(root);
        getPreNoRecur(root);
        System.out.println("中序遍历");
        getMidNoRecur(root);
        System.out.println("后序遍历");
        getPostNoRecur(root);
    }


    /**
     * 用非递归的方式进行前序遍历二叉树
     * 利用栈的方式进行存储，然后进行弹开
     *
     * @param root
     */
    public static void preOrderNoRecursion(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode head = stack.pop();
            System.out.print("->" + head.value);
            if (head.right != null) stack.push(head.right);//先放入右节点
            if (head.left != null) stack.push(head.left);//再放入左节点
        }
    }

    /**
     * 用递归的方式进行前序遍历二叉树
     *
     * @param root
     */
    public static void preOrderRecursion(TreeNode root) {
        if (root == null) return;
        System.out.print(root.value + "->");
        preOrderRecursion(root.left);
        preOrderRecursion(root.right);
    }

    /**
     * 用递归的方式进行中序遍历二叉树
     *
     * @param root
     */
    public static void midOrderNoRecursion(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                System.out.print(root.value + "->");
                root = root.right;
            }
        }
    }

    /**
     * 用递归的方式进行中序遍历二叉树
     *
     * @param root
     */
    public static void midOrderRecursion(TreeNode root) {
        if (root == null) return;
        midOrderRecursion(root.left);
        System.out.print(root.value + "->");
        midOrderRecursion(root.right);
    }

    /**
     * 用非递归的方式进行后序遍历二叉树
     * 用两个栈来使用
     *
     * @param root
     */
    public static void postOrderNoRecursion(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            root = stack1.pop();
            stack2.push(root);
            if (root.left != null) stack1.push(root.left);
            if (root.right != null) stack1.push(root.right);
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().value + "->");
        }
    }

    /**
     * 用递归的方式进行后序遍历二叉树
     *
     * @param root
     */
    public static void postOrderRecursion(TreeNode root) {
        if (root == null) return;
        postOrderRecursion(root.left);
        postOrderRecursion(root.right);
        System.out.print(root.value + "->");
    }

    /**
     * 前序遍历非递归
     *
     * @param root
     */
    public static void getPreNoRecur(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            System.out.print(root.value + "->");
            if (root.right != null) stack.push(root.right);
            if (root.left != null) stack.push(root.left);
        }


    }

    /**
     * 中序遍历非递归
     * @param root
     */
    public static void getMidNoRecur(TreeNode root){
        if (root==null) return;
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null||!stack.isEmpty()){
            if (root!=null){
                stack.push(root);
                root=root.left;
            }else {
                root=stack.pop();
                System.out.print(root.value+"->");
                root=root.right;
            }
        }
    }
    public static void getPostNoRecur(TreeNode root){
        if (root==null) return;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            root = stack1.pop();
            stack2.push(root);
            if (root.left!=null) stack1.push(root.left);
            if (root.right!=null) stack1.push(root.right);
        }
        while (!stack2.isEmpty()){
            System.out.print(stack2.pop().value+"->");
        }
    }
}

//定义一个二叉树
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

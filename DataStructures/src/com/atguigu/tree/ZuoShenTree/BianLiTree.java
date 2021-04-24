package com.atguigu.tree.ZuoShenTree;

import javax.management.ListenerNotFoundException;
import java.util.Stack;

//�ֱ��õݹ�ͷǵݹ�ķ�ʽ�����ַ�ʽ����������
//ǰ�к������
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


//        System.out.println("ǰ��������Ϊ��");
//        preOrderRecursion(root);
//        System.out.println();
//        System.out.println("����������Ϊ��");
//        midOrderRecursion(root);
//        System.out.println();
//        System.out.println("�����������Ϊ��");
//        postOrderRecursion(root);


        System.out.println("ǰ��������Ϊ��");
//        preOrderNoRecursion(root);
//        System.out.println();
//        System.out.println("zhong��������Ϊ��");
//        midOrderNoRecursion(root);
//        System.out.println();
//        System.out.println("�ǵݹ�ķ�ʽ�ĺ���������Ϊ��");
//        postOrderNoRecursion(root);
        getPreNoRecur(root);
        System.out.println("�������");
        getMidNoRecur(root);
        System.out.println("�������");
        getPostNoRecur(root);
    }


    /**
     * �÷ǵݹ�ķ�ʽ����ǰ�����������
     * ����ջ�ķ�ʽ���д洢��Ȼ����е���
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
            if (head.right != null) stack.push(head.right);//�ȷ����ҽڵ�
            if (head.left != null) stack.push(head.left);//�ٷ�����ڵ�
        }
    }

    /**
     * �õݹ�ķ�ʽ����ǰ�����������
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
     * �õݹ�ķ�ʽ�����������������
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
     * �õݹ�ķ�ʽ�����������������
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
     * �÷ǵݹ�ķ�ʽ���к������������
     * ������ջ��ʹ��
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
     * �õݹ�ķ�ʽ���к������������
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
     * ǰ������ǵݹ�
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
     * ��������ǵݹ�
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

//����һ��������
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

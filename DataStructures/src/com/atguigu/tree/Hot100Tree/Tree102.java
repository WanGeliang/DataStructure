package com.atguigu.tree.Hot100Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层序遍历
 */
public class Tree102 {


    public static void main(String[] args) {

    }

    /**
     * 用队列的思想实现poll pollFirst pollLast peek add
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List resList = new ArrayList<ArrayList<Integer>>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);
        while (linkedList.size()>0) {
            int count = linkedList.size();
            List list = new ArrayList<Integer>();
            while (count > 0) {
                TreeNode node = linkedList.pollFirst();
                list.add(node.value);
                if (node.left != null) linkedList.add(node.left);
                if (node.right != null) linkedList.add(node.right);
                count--;
            }
            resList.add(list);
        }
        return resList;
    }

}

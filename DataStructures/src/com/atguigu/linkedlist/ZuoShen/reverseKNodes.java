package com.atguigu.linkedlist.ZuoShen;

import java.util.Stack;

public class reverseKNodes {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8))))))));
//        System.out.println("原始节点：" + head);
//        Stack<ListNode> stack = new Stack<>();stack.push(new ListNode(1));stack.push(new ListNode(2));stack.push(new ListNode(3));
//        System.out.println("以k为原始节点的反转过后的链表："+getKNodes(stack,null,null));
//        System.out.println("以k为原始节点的反转过后的链表："+reverseNodes(head, 4));
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        reverseNodes(head,2);
    }

    /**
     * 一个链表中以k为单位进行反转链表，不足k的，就不进行反转
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode reverseNodes(ListNode head, int k) {
        if (k < 2) return head;
        Stack<ListNode> stack = new Stack<>();
        ListNode newHead = head;
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            stack.push(cur);
            if (stack.size() == k) {
                pre = getKNodes(stack, pre, next);//pre指的是前一个节点，next指的是下一个节点
                newHead = newHead == head ? cur : newHead;//在这里，第一次进入，肯定是newHead==head的,那这里的头节点就是cur，后面如果再从这里进去，newHead!=head,最终的头节点应该是刚开始的节点就是newHead;
            }
            cur = next;
        }
        return newHead;
    }

    public static ListNode getKNodes(Stack<ListNode> stack, ListNode left, ListNode right) {
        ListNode cur = stack.pop();
        //如果上一次的尾节点不足，就作为新一轮节点的头节点
        if (left != null) {
            left.next = cur;
        }
        ListNode temp = null;
        while (!stack.isEmpty()) {
            temp = stack.pop();
            cur.next = temp;//将当前节点指向下一个节点
            cur = temp;//然后下一个节点将转移为当前节点
        }
        cur.next = right;//将从栈中pop出来的
        return cur;
    }
}

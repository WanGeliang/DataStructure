package com.atguigu.linkedlist.ZuoShen;

import java.util.Stack;

public class ZuoShenP68 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(7))));
        System.out.println(reverseNodes(head, 3));
    }

    public static ListNode reverseNodes(ListNode head, int k) {
        if (k < 2) return head;
        ListNode newHead = head;
        ListNode cur = head;
        ListNode pre = null;
        ListNode nextNode = null;
        Stack<ListNode> stack = new Stack<>();
        while (cur != null) {
            nextNode = cur.next;
            stack.push(cur);
            if (k == stack.size()) {
                pre = getNodes(stack, pre, nextNode);
                newHead = newHead == head ? cur : head;
            }
            cur = nextNode;
        }
        return newHead;
    }

    public static ListNode getNodes(Stack<ListNode> stack, ListNode pre, ListNode nextNode) {
        ListNode temp = stack.pop();
        if (pre != null) {
            pre.next = temp;
        }
        ListNode xNode = null;
        while (!stack.isEmpty()) {
            xNode = stack.pop();
            temp.next = xNode;
            temp = xNode;
        }
        temp.next = nextNode;
        return temp;
    }
}

package com.atguigu.linkedlist.ZuoShen;

public class JoseguProblem {
    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        node1.next=node1;
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node1;
        System.out.println(node1);
//        System.out.println(getOneNode(node1, 2));
    }

    public static ListNode getOneNode(ListNode head, int m) {
        if (m < 1 || head == null || head.next == null || head.next == head) return head;
        ListNode last = head;
        while (last != null) {
            last = last.next;
        }
        int count = 0;
        while (head != last) {
            if (++count == m) {
                last.next = head.next;
                count = 0;
            } else {
                last = last.next;
            }
            head = last.next;
        }
        return head;
    }
}

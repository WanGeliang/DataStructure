package com.atguigu.linkedlist.ZuoShen;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.LinkedList;

public class ReverseSingleLinkedList {
    /**
     * ���ط�ת����
     *
     * @param args
     */
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
//        System.out.println("ԭʼ����Ϊ��" + head);
        System.out.println("----------------------------------------");
//        System.out.println("���ַ�ת���������Ϊ��" + reverseAreaLinkedList(head, 2, 5));
//        System.out.println("ȫ����ת�ĵ�������Ϊ��"+reverseLinkedList(head));
//        ListNode head1 = new ListNode(1,new ListNode(2,new ListNode(3)));
//        System.out.println(head1);
//        head1=head;
//        System.out.println("head1--->"+head1);
//        System.out.println("head1.next--->"+head1.next);
        DoubleListNode d1 = new DoubleListNode(1);
        DoubleListNode d2 = new DoubleListNode(2);
        DoubleListNode d3 = new DoubleListNode(3);
        d1.last = null;
        d1.next = d2;
        d2.last = d1;
        d2.next = d3;
        d3.last = d2;
        d3.next = null;
        reverseDoubleList(d1);
    }

    /**
     * ��ת���ֵ�������
     *
     * @param head
     * @param from
     * @param to
     * @return
     */
    public static ListNode reverseAreaLinkedList(ListNode head, int from, int to) {
        ListNode node1 = head;
        ListNode PreNode = null;
        ListNode AfterNode = null;
        int len = 0;
        while (node1 != null) {
            len++;
            PreNode = len == from - 1 ? node1 : PreNode;
            AfterNode = len == to + 1 ? node1 : AfterNode;
            node1 = node1.next;
        }
        node1 = PreNode == null ? head : PreNode.next;
        ListNode node2 = node1.next;
        node1.next = AfterNode;
        ListNode next = null;
        while (node2 != AfterNode) {
            next = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = next;
        }
        if (PreNode != null) {
            PreNode.next = node1;
            return head;
        }
        return node1;
    }

    /**
     * ��ת���еĵ�������
     *
     * @param head
     * @return
     */
    public static ListNode reverseLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = null;
        ListNode temp = null;
        while (head != null) {
            temp = head.next;
            head.next = res;
            res = head;
            head = temp;
        }
        return res;
    }

    /**
     * ��ת˫������
     *
     * @param head
     * @return
     */
    public static DoubleListNode reverseDoubleList(DoubleListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        DoubleListNode pre = null;
        DoubleListNode temp = null;
        while (head != null) {
            temp = head.next;
            head.next = pre;
            head.last = temp;
            pre = head;
            head = temp;
        }
        return pre;
    }
}


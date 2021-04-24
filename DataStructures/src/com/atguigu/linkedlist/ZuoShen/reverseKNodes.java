package com.atguigu.linkedlist.ZuoShen;

import java.util.Stack;

public class reverseKNodes {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8))))))));
//        System.out.println("ԭʼ�ڵ㣺" + head);
//        Stack<ListNode> stack = new Stack<>();stack.push(new ListNode(1));stack.push(new ListNode(2));stack.push(new ListNode(3));
//        System.out.println("��kΪԭʼ�ڵ�ķ�ת���������"+getKNodes(stack,null,null));
//        System.out.println("��kΪԭʼ�ڵ�ķ�ת���������"+reverseNodes(head, 4));
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        reverseNodes(head,2);
    }

    /**
     * һ����������kΪ��λ���з�ת��������k�ģ��Ͳ����з�ת
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
                pre = getKNodes(stack, pre, next);//preָ����ǰһ���ڵ㣬nextָ������һ���ڵ�
                newHead = newHead == head ? cur : newHead;//�������һ�ν��룬�϶���newHead==head��,�������ͷ�ڵ����cur����������ٴ������ȥ��newHead!=head,���յ�ͷ�ڵ�Ӧ���Ǹտ�ʼ�Ľڵ����newHead;
            }
            cur = next;
        }
        return newHead;
    }

    public static ListNode getKNodes(Stack<ListNode> stack, ListNode left, ListNode right) {
        ListNode cur = stack.pop();
        //�����һ�ε�β�ڵ㲻�㣬����Ϊ��һ�ֽڵ��ͷ�ڵ�
        if (left != null) {
            left.next = cur;
        }
        ListNode temp = null;
        while (!stack.isEmpty()) {
            temp = stack.pop();
            cur.next = temp;//����ǰ�ڵ�ָ����һ���ڵ�
            cur = temp;//Ȼ����һ���ڵ㽫ת��Ϊ��ǰ�ڵ�
        }
        cur.next = right;//����ջ��pop������
        return cur;
    }
}

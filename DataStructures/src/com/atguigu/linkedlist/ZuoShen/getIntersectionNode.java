package com.atguigu.linkedlist.ZuoShen;

/**
 * ���������ཻ�����
 */
public class getIntersectionNode {


    public static ListNode getCircleLinkedList(ListNode head1, ListNode head2) {
        //�������ཻ

        return null;
    }

    //һ���л���һ���޻����������ཻ
    //�ʣ�ֻ�������л��������ཻ���п����ཻ
    //һ�ǣ�loop1==loop2�����������ཻ��
    public static ListNode Loop1NoEqualLoop2(ListNode head1, ListNode head2) {
        return null;
    }

    //���ǣ�loop1!=loop2�����������ཻ��
    public static ListNode Loop1EqualLoop2(ListNode head1, ListNode head2) {
        ListNode loop1 = getCommonListNode(head1);
        ListNode loop2 = getCommonListNode(head2);
        ListNode cur1 = head1;
        ListNode cur2 = head2;
        if (loop1 == loop2) {

            //��head1��β�ڵ�����Ϊloop1
            while (cur1 != loop1) {
                cur1 = cur1.next;
            }
            cur1.next = null;
            //��head2��β�ڵ�����Ϊloop2
            while (cur2 != loop2) {
                cur2 = cur2.next;
            }
            cur2.next = null;
            //���õ������ཻʹ�õķ������ҵ��ཻ�ڵ�
            return getCircleLinkedList(head1, head2);
        } else {//loop1!=loop2
            cur1=loop1.next;
            while (cur1!=loop1){
                if (cur1==loop2){
                    return loop1;//�л�������loop1����loop2����ڵ�
                }
                cur1=cur1.next;
            }
            return null;//�л�����������û�нڵ�
        }
    }

    /**
     * Ѱ��һ�������������ڽڵ�
     *
     * @param head1
     * @return
     */
    public static ListNode getCommonListNode(ListNode head1) {
        if (head1 == null || head1.next == null || head1.next.next == null) return null;
        ListNode slow = head1;
        ListNode fast = head1.next.next;
        while (slow != fast) {//����ָ��Ѱ�һ�
            if (fast.next == null || fast.next.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head1;//�л�Ѱ����ڽڵ�
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    //�������ཻ

    /**
     * �������ཻ�нڵ�
     * @param head1
     * @param head2
     * @return
     */
    public static ListNode NoLoopLinkedList(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) return null;
        ListNode cur1 = head1;
        ListNode cur2 = head2;
        int n = 0;
        while (cur1 != null) {
            n++;
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            n--;
            cur2 = cur2.next;
        }
        if (cur1 != cur2) return null;
        cur1 = n > 0 ? head1 : head2;
        cur2 = cur1 == head1 ? head2 : head1;
        n = Math.abs(n);
        while (n != 0) {
            cur1 = cur1.next;
        }
        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }

}

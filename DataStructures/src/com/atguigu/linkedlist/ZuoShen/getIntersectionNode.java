package com.atguigu.linkedlist.ZuoShen;

/**
 * 环形链表相交的情况
 */
public class getIntersectionNode {


    public static ListNode getCircleLinkedList(ListNode head1, ListNode head2) {
        //单链表相交

        return null;
    }

    //一个有环，一个无环链表不可能相交
    //故，只有连个有环的链表相交才有可能相交
    //一是，loop1==loop2，两个链表相交了
    public static ListNode Loop1NoEqualLoop2(ListNode head1, ListNode head2) {
        return null;
    }

    //二是，loop1!=loop2，两个链表相交了
    public static ListNode Loop1EqualLoop2(ListNode head1, ListNode head2) {
        ListNode loop1 = getCommonListNode(head1);
        ListNode loop2 = getCommonListNode(head2);
        ListNode cur1 = head1;
        ListNode cur2 = head2;
        if (loop1 == loop2) {

            //将head1的尾节点设置为loop1
            while (cur1 != loop1) {
                cur1 = cur1.next;
            }
            cur1.next = null;
            //将head2的尾节点设置为loop2
            while (cur2 != loop2) {
                cur2 = cur2.next;
            }
            cur2.next = null;
            //调用单链表相交使用的方法，找到相交节点
            return getCircleLinkedList(head1, head2);
        } else {//loop1!=loop2
            cur1=loop1.next;
            while (cur1!=loop1){
                if (cur1==loop2){
                    return loop1;//有环，就是loop1或者loop2这个节点
                }
                cur1=cur1.next;
            }
            return null;//有环，两个链表没有节点
        }
    }

    /**
     * 寻找一个环形链表的入口节点
     *
     * @param head1
     * @return
     */
    public static ListNode getCommonListNode(ListNode head1) {
        if (head1 == null || head1.next == null || head1.next.next == null) return null;
        ListNode slow = head1;
        ListNode fast = head1.next.next;
        while (slow != fast) {//快慢指针寻找环
            if (fast.next == null || fast.next.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = head1;//有环寻找入口节点
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    //单链表相交

    /**
     * 单链表相交有节点
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

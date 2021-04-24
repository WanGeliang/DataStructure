package com.atguigu.linkedlist.ZuoShen;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleLinkedlList {
    public static void main(String[] args) {
        ;
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode head1 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(7)))));
        ListNode head2 = new ListNode(4, new ListNode(5, new ListNode(3, new ListNode(8, new ListNode(1)))));
//        DoubleListNode h1=new DoubleListNode(1,null,new DoubleListNode(2));
//        DoubleListNode h2=new DoubleListNode(2,h1,new DoubleListNode(3));
//        DoubleListNode h3=new DoubleListNode(3,h2,new DoubleListNode(4));
//        DoubleListNode h4=new DoubleListNode(4,h3,new DoubleListNode(5));
//        System.out.println(h1);
//        list(head1);
//        list(head2);
//        printCommonPart(head1,head2);
//        System.out.println("原始节点信息.....");
//        list(head);
//        System.out.println("删除第K个节点后.....");
//        list(removeNthFromEnd(head, 3));
        //反转链表
//        reverseListNode(head);
//        System.out.println(sortList(head2));
//        sortList(head2);
//        ListNode head4 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        ListNode head4 = new ListNode(0,new ListNode(0));
        System.out.println(isPalindrome(head4));
//        isPalindrome(head4);
    }

    /**
     * 删除单项倒数第n个节点
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 1) return null;
        ListNode cur = head;
        while (cur != null) {
            n--;
            cur = cur.next;
        }
        if (n > 0) return null;
        if (n == 0) head = head.next;
        if (n < 0) {
            cur = head;
            while (++n != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }

    /**
     * 反转双链表
     *
     * @param head
     * @param n
     * @return
     */
    public static DoubleListNode removeDoubleList(DoubleListNode head, int n) {
        if (head == null || n < 1) return null;
        DoubleListNode cur = head;
        while (cur != null) {
            n--;
            cur = cur.next;
        }
        if (n == 0) head = head.next;
        if (n > 0) return null;
        if (n < 0) {
            cur = head;
            while (++n != 0) {
                cur = cur.next;
            }
            DoubleListNode newNode = cur.next.next;
            cur.next = newNode;
            if (newNode != null) {
                newNode.last = cur;
            }
        }
        return head;
    }

    /**
     * 打印两个链表公共部分
     *
     * @param head1
     * @param head2
     */
    public static void printCommonPart(ListNode head1, ListNode head2) {
        System.out.println("两个链表公共的部分是....");
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                head1 = head1.next;
            } else if (head1.val > head2.val) {
                head2 = head2.next;
            } else {
                System.out.print("->" + head1.val);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }

    /**
     * 反转单向链表
     *
     * @param head
     */
    public static void reverseListNode(ListNode head) {
        if (head == null || head.next == null) System.out.println(head);

        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        System.out.println("反转后的链表为：" + pre);
    }

    //显示链表[遍历]
    public static void list(ListNode head) {
        //判断链表是否为空
        if (head == null) {
            System.out.println("链表为空");
            return;
        }
        System.out.println(head);

    }

    /**
     * 排序单向链表
     *
     * @param head
     * @return
     */
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        List<Integer> list = new ArrayList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        ListNode resNode = new ListNode(-1);
        ListNode cur = resNode;
        for (int i = 0; i < list.size(); i++) {
            cur.next = new ListNode(list.get(i));
            cur = cur.next;
        }
        System.out.println(cur);
        return resNode.next;
    }

    /**
     * 判断是否是回文链表
     *
     * @param head
     * @return
     */
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        List<Integer> list = new ArrayList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int i = 0, j = list.size() - 1;
        while (i < j) {
            if (list.get(i) == list.get(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}

//单链表的构造方法
class ListNode {
    int val;
    ListNode next;


    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

//双链表的构造方法
class DoubleListNode {
    DoubleListNode last;
    int val;
    DoubleListNode next;

    public DoubleListNode(int val) {
        this.val = val;
    }


    @Override
    public String toString() {
        return "DoubleListNode{" +
                ", last=" + last +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
package com.atguigu.linkedlist.ZuoShen;


import java.util.Stack;

/**
 * 合并两个链表，使得新链表有满足数字之和为新的链表
 */
public class MergerLinkedList {
    public static void main(String[] args) {
        ListNode h1 = new ListNode(1, new ListNode(5, new ListNode(3)));
        ListNode h2 = new ListNode(8, new ListNode(4, new ListNode(7)));
        System.out.println(mergerList(h1, h2));
    }

    /**
     * 方法1，利用栈装入两个链表的数据值
     * @param h1
     * @param h2
     * @return
     */
    public static ListNode mergerList(ListNode h1,ListNode h2){
        if (h1==null) return h2;
        if (h2==null) return h1;
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        while (h1!=null){
            s1.push(h1.val);
            h1=h1.next;
        }
        while (h2!=null){
            s2.push(h2.val);
            h2=h2.next;
        }
        ListNode resNode=null;
        ListNode temp=null;
        int n=0,n1=0,n2=0,m=0;
        while (!s1.isEmpty()||!s2.isEmpty()){
            n1=s1.isEmpty()?0:s1.pop();
            n2=s2.isEmpty()?0:s2.pop();
            n=n1+n2+m;
            temp=resNode;
            resNode=new ListNode(n%10);
            resNode.next=temp;
            m=n/10;
        }
        if (m==1){
            temp=resNode;
            resNode=new ListNode(1);
            resNode.next=temp;
        }
        return resNode;
    }

    /**
     * 方法2：利用链表反转，不占用额外的内存空间
     * @param h1
     * @param h2
     * @return
     */
    public static ListNode mergerList2(ListNode h1,ListNode h2){
        return null;
    }
}

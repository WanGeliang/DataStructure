package com.atguigu.linkedlist.ZuoShen;

import java.util.Stack;

/**
 *
 */
public class IsHuiWenLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1))));
        System.out.println(isHuiWenLinked(head));
    }

    /**
     * 利用栈来存放节点信息
     * @param head
     * @return
     */
    public static boolean isHuiWenLinked(ListNode head){
        if (head==null||head.next==null) return true;
        Stack<ListNode> stack=new Stack<>();
        ListNode cur=head;
        while (cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        while (!stack.isEmpty()){
            if (stack.pop().val!=head.val){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}

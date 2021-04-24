package JianZhiOffer;

public class JZ_doubleLinkedList {
    public static void main(String[] args) {

    }

    //反转双向链表
    public DoubleNode reverseDoubleLinkedList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }

    //反转单向链表
    public SingleNode reverseSingleNode(SingleNode head) {
        SingleNode pre = null;
        SingleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}

class DoubleNode {
    int value;
    DoubleNode last;
    DoubleNode next;

    public DoubleNode(int data) {
        this.value = data;
    }
}

class SingleNode {
    int value;
    SingleNode next;


    public SingleNode(int data) {
        this.value = data;
    }
}

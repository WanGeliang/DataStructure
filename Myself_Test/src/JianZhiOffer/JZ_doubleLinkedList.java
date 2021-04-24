package JianZhiOffer;

public class JZ_doubleLinkedList {
    public static void main(String[] args) {

    }

    //��ת˫������
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

    //��ת��������
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

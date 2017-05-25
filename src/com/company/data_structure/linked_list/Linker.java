package com.company.data_structure.linked_list;

/**
 * Created by Abir on 08-May-17.
 */
public class Linker {

    public static void main(String[] args) {
        Node node = new Node();
        node.data = 4;
        node.next = null;

        Node node1 = new Node();
        node1.data = 3;
        node1.next = node;

        Node node2 = new Node();
        node2.data = 2;
        node2.next = node1;

        Node node3 = new Node();
        node3.data = 1;
        node3.next = node2;

        ReversePrint(node3);
        //Node resultHead = InsertNth(node3, 5, 4);
        //Node resultHead = Delete(node3, 0);
        Node resultHead = Reverse(node3);
        while (resultHead != null) {
            System.out.println(resultHead.data);
            resultHead = resultHead.next;
        }
    }

    private static Node InsertNth(Node head, int data, int position) {
        int currentPos = 1;
        Node firstNode = head;

        while (head != null) {
            Node node = new Node();
            node.data = data;
            if (position == 0) {
                node.next = head;
                return node;
            } else if (currentPos == position) {
                node.next = head.next;
                head.next = node;
            }
            head = head.next;
            currentPos++;
        }
        return firstNode;
    }

    private static Node Delete(Node head, int position) {
        int currentPos = 0;
        Node firstNode = head;
        Node prevNode = null;
        while (head != null) {
            if (position == 0) {
                return head.next;
            } else if ((currentPos + 1) == position) {
                prevNode = head;
            } else if (currentPos == position) {
                prevNode.next = head.next;
                return firstNode;
            }
            head = head.next;
            currentPos++;
        }
        return firstNode;
    }

    private static void ReversePrint(Node head) {
        if (head == null) {
            return;
        }
        ReversePrint(head.next);
        System.out.println(head.data);
    }

    private static Node Reverse(Node head) {
        if (head.next == null) {
            return head;
        }
        Node n = Reverse(head.next);
        Node temp = head.next;
        temp.next = head;
        head.next = null;
        return n;
    }
}

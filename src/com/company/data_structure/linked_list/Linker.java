package com.company.data_structure.linked_list;

/**
 * Created by Abir on 08-May-17.
 */
public class Linker {
    static class Node {
        int data;
        Node next;
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.data = 1;
        node.next = null;

        Node node1 = new Node();
        node1.data = 2;
        node1.next = node;

        Node node2 = new Node();
        node2.data = 3;
        node2.next = node1;

        Node node3 = new Node();
        node3.data = 4;
        node3.next = node2;

        //printData(node3);
        //Insert(node3, 5);
        InsertNth(node3, 5, 1);
    }

    static void printData(Node head) {
        if (head != null) {
            System.out.print(head.data);
            printData(head.next);
        }
    }

    static Node Insert(Node head, int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = head;
        printData(newNode);
        return newNode;
    }

    static Node InsertNth(Node head, int data, int position) {
        int till = 0;
        Node firstNode = head;
        while (position != till) {
            head = head.next;
            till++;
        }

        Node node = new Node();
        node.data = data;
        node.next = head;

        if (position != 0) {
            printData(firstNode);
            return firstNode;
        } else {
            printData(node);
            return node;
        }
    }
}

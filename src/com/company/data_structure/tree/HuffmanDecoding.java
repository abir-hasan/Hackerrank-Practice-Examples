package com.company.data_structure.tree;

/**
 * Created by Abir on 26-May-17.
 * Problem: Data Structures >Trees >Tree: Huffman Decoding
 */
public class HuffmanDecoding {

    static class Node {
        public int frequency; // the frequency of this tree
        public char data;
        public Node left, right;
    }


    static void decode(String S, Node root) {
        if (S == null) return;
        Node originalRoot = root;
        String decodedString = "";
        int encodingLength = S.length();
        char[] inputs = S.toCharArray();
        for (int i = 0; i < encodingLength; i++) {
            if (inputs[i] == '0') {
                root = root.left;
                if (root.left == null && root.right == null) {
                    decodedString += root.data;
                    root = originalRoot;
                }
            } else {
                root = root.right;
                if (root.left == null && root.right == null) {
                    decodedString += root.data;
                    root = originalRoot;
                }
            }
        }
        System.out.println(decodedString);
    }

    static Node createDummyHuffmanTree() {
        Node node = new Node();
        node.left = null;
        node.right = null;
        node.frequency = 1;
        node.data = 'B';

        Node node1 = new Node();
        node1.left = null;
        node1.right = null;
        node1.frequency = 1;
        node1.data = 'C';

        Node node2 = new Node();
        node2.left = node;
        node2.right = node1;
        node2.frequency = 2;
        node2.data = '\0';

        Node node3 = new Node();
        node3.left = null;
        node3.right = null;
        node3.frequency = 3;
        node3.data = 'A';

        Node node4 = new Node();
        node4.left = node2;
        node4.right = node3;
        node4.frequency = 5;
        node4.data = '\0';

        return node4;
    }

    public static void main(String[] args) {
        decode("1001011", createDummyHuffmanTree());
    }
}

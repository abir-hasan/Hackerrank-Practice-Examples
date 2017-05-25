package com.company.data_structure.tree;

/**
 * Created by Abir on 24-May-17.
 */
public class BinarySearchTreeInsertion {

    public static void main(String[] args) {
        TreeNode node = Insert(createDummyTree(), 0);
        TreePractice.inOrder(node); // Print
    }

    static TreeNode createDummyTree() {
        TreeNode node1 = new TreeNode();
        node1.left = null;
        node1.right = null;
        node1.data = 1;

        TreeNode node3 = new TreeNode();
        node3.left = null;
        node3.right = null;
        node3.data = 3;

        TreeNode node2 = new TreeNode(node1, node3, 2);
        TreeNode node5 = new TreeNode(null, null, 5);
        TreeNode node4 = new TreeNode(node2, node5, 4);
        return node4;
    }

    // Assuming no duplicate entries
    static TreeNode Insert(TreeNode root, int value) {
        TreeNode originalRoot = root;
        TreeNode newNode = new TreeNode();
        newNode.left = null;
        newNode.right = null;
        newNode.data = value;
        if (originalRoot == null) return newNode;

        while (root != null) {
            if (root.data > value) {
                if (root.left != null) {
                    root = root.left;
                } else {
                    root.left = newNode;
                    break;
                }
            } else {
                if (root.right != null) {
                    root = root.right;
                } else {
                    root.right = newNode;
                    break;
                }
            }
        }
        return originalRoot;
    }
}

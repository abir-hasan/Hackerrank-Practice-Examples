package com.company.data_structure.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Abir Hasan123 on 17-May-17.
 */
public class TreePractice {

    static Stack<TreeNode> nodeStack;
    static List<Integer> nodeList;

    public static void main(String[] args) {
        TreeNode root = createTree();

        // Iterative way
        /*traverseTreeInorder(root);
        printData();*/
        /*treeTraversePreOrder(root);
        printData();*/
        /*treeTraversePostOrder(root);
        printData();*/


        // Recursively
        /*preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        inOrder(root);*/

        top_view(root);
    }


    static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    private static void traverseTreeInorder(TreeNode root) {
        reInitialize();
        if (root == null) return;

        nodeStack.push(root);
        while (!nodeStack.empty()) {
            TreeNode tempRoot = nodeStack.peek();
            if (tempRoot.left != null) {
                nodeStack.push(tempRoot.left);
                tempRoot.left = null;
            } else {
                nodeList.add(tempRoot.data);
                nodeStack.pop();
                if (tempRoot.right != null) {
                    nodeStack.push(tempRoot.right);
                }
            }
        }
    }

    static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    private static void treeTraversePreOrder(TreeNode root) {
        reInitialize();
        if (root == null) return;

        nodeStack.push(root);
        while (!nodeStack.empty()) {
            TreeNode node = nodeStack.pop();
            nodeList.add(node.data);
            if (node.right != null) {
                nodeStack.push(node.right);
            }
            if (node.left != null) {
                nodeStack.push(node.left);
            }

        }
    }

    static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    private static void treeTraversePostOrder(TreeNode root) {
        reInitialize();
        if (root == null) return;

        nodeStack.push(root);
        while (!nodeStack.empty()) {
            TreeNode node = nodeStack.peek();
            if (node.right != null || node.left != null) {
                if (node.right != null) {
                    nodeStack.push(node.right);
                    node.right = null;
                }
                if (node.left != null) {
                    nodeStack.push(node.left);
                    node.left = null;
                }
            } else {
                nodeList.add(node.data);
                nodeStack.pop();
            }
        }
    }

    private static void printData() {
        for (Integer aTreeNodeList : nodeList) {
            System.out.println(aTreeNodeList);
        }
    }

    private static void reInitialize() {
        nodeList = new ArrayList<>();
        nodeStack = new Stack<>();
    }

    static void top_view(TreeNode root) {
        printLeftTree(root.left);
        System.out.print(root.data + " ");
        printRightTree(root.right);
    }

    private static void printRightTree(TreeNode right) {
        System.out.print(right.data + " ");
        if (right.right != null) {

            printRightTree(right.right);
        }
    }

    private static void printLeftTree(TreeNode left) {
        if (left.left != null) {
            printLeftTree(left.left);
        }
        System.out.print(left.data + " ");

    }


    private static TreeNode createTree() {
        TreeNode treeNode4 = new TreeNode();
        treeNode4.left = null;
        treeNode4.right = null;
        treeNode4.data = 4;

        TreeNode treeNode5 = new TreeNode();
        treeNode5.left = null;
        treeNode5.right = null;
        treeNode5.data = 5;

        TreeNode treeNode1 = new TreeNode();
        treeNode1.left = treeNode4;
        treeNode1.right = treeNode5;
        treeNode1.data = 1;


        TreeNode treeNode9 = new TreeNode();
        treeNode9.left = null;
        treeNode9.right = null;
        treeNode9.data = 9;

        TreeNode treeNode8 = new TreeNode();
        treeNode8.left = treeNode9;
        treeNode8.right = null;
        treeNode8.data = 8;

        TreeNode treeNode7 = new TreeNode();
        treeNode7.left = null;
        treeNode7.right = null;
        treeNode7.data = 7;

        TreeNode treeNode6 = new TreeNode();
        treeNode6.left = treeNode8;
        treeNode6.right = treeNode7;
        treeNode6.data = 6;


        TreeNode treeNode2 = new TreeNode();
        treeNode2.left = null;
        treeNode2.right = treeNode6;
        treeNode2.data = 2;

        TreeNode treeNode3 = new TreeNode();
        treeNode3.left = treeNode1;
        treeNode3.right = treeNode2;
        treeNode3.data = 3;

        return treeNode3;
    }
}

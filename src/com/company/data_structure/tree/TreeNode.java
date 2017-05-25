package com.company.data_structure.tree;

/**
 * Created by Abir on 24-May-17.
 */
class TreeNode {
    TreeNode left;
    TreeNode right;
    int data;

    TreeNode() {

    }

    TreeNode(TreeNode left, TreeNode right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }
}

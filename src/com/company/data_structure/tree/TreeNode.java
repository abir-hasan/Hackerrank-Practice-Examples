package com.company.data_structure.tree;

/**
 * Created by Abir on 24-May-17.
 */
public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public int data;

    public TreeNode() {

    }

    public TreeNode(TreeNode left, TreeNode right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }
}

package com.company.data_structure.tree;

/**
 * Created by Abir on 28-May-17.
 * Problem: Data Structures >Trees >Binary Search Tree : Lowest Common Ancestor
 */
public class BSTLowestCommonAncestor {

    public static void main(String[] args) {
        TreeNode bstRoot = BinarySearchTreeInsertion.createDummyTree();
        System.out.println(lca(bstRoot, 3, 5).data);
    }

    /**
     * Given that tree won't be null and also values would be present in the tree
     *
     * @param root - Root of the tree
     * @param v1   - value1
     * @param v2   - value2
     * @return lca node of the two values
     */
    static TreeNode lca(TreeNode root, int v1, int v2) {
        if (v1 > v2) {
            int temp = v1;
            v1 = v2;
            v2 = temp;
        }
        while (!((root.data > v1 && root.data < v2) || (root.data == v1 || root.data == v2))) {
            if (root.data > v1 && root.data > v2) {
                root = root.left;
            } else if (root.data < v1 && root.data < v2) {
                root = root.right;
            }
        }
        return root;
    }
}

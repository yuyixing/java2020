package com.yuyx.offer;

import java.util.Objects;

/**
 * Definition for a binary tree node.
 *
 * @author yuyx
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TreeNode)) {
            return false;
        }

        TreeNode treeNode = (TreeNode) obj;
        return (this.val == treeNode.val)
                && (this.left == null || this.left.equals(treeNode.left))
                && (this.right == null || this.right.equals(treeNode.right));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.val, this.left, this.right);
    }

}

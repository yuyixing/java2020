package com.yuyx.offer;

/**
 * 二叉树的下一个结点
 *
 * @author yuyx
 */
public class Offer08 {

    /**
     * O(n) O(n)
     */
    public TreeNode getNextNodeByPreorder(TreeNode tree, int val) {
        int[] ints = tree.getPreorderTraversal();
        if (paramsInvalid(ints)) {
            return null;
        }
        int index = Utils.getIndexOfInts(ints, val);
        if (index < 0 || index == ints.length - 1) {
            return null;
        }
        return tree.getSubTreeNodeByPreorder(ints[++index]);
    }

    /**
     * O(n) O(n)
     */
    public TreeNode getNextNodeByInorder(TreeNode tree, int val) {
        int[] ints = tree.getInorderTraversal();
        if (paramsInvalid(ints)) {
            return null;
        }
        int index = Utils.getIndexOfInts(ints, val);
        if (index < 0 || index == ints.length - 1) {
            return null;
        }
        return tree.getSubTreeNodeByInorder(ints[++index]);
    }

    /**
     * O(n) O(n)
     */
    public TreeNode getNextNodeByPostorder(TreeNode tree, int val) {
        int[] ints = tree.getPostorderTraversal();
        if (paramsInvalid(ints)) {
            return null;
        }
        int index = Utils.getIndexOfInts(ints, val);
        if (index < 0 || index == ints.length - 1) {
            return null;
        }
        return tree.getSubTreeNodeByPostorder(ints[++index]);
    }

    private boolean paramsInvalid(int[] preorder) {
        return preorder == null || preorder.length == 0;
    }
}

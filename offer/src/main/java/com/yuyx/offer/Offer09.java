package com.yuyx.offer;

/**
 * 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。
 * (若队列中没有元素，deleteHead 操作返回 -1 )
 *
 * @author yuyx
 */
public class Offer09 {

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

    private boolean paramsInvalid(int[] preorder) {
        return preorder == null || preorder.length == 0;
    }
}

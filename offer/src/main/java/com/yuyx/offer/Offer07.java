package com.yuyx.offer;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 重建二叉树
 *
 * @author yuyx
 */
public class Offer07 {

    /**
     * recursion
     * O(n) O(n)
     */
    public TreeNode buildTree0101(int[] preorder, int[] inorder) {
        if (paramsInvalid(preorder, inorder)) {
            return null;
        }

        int length = inorder.length;
        Map<Integer, Integer> inorderIndexMap = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return recursive(preorder, 0, length - 1, 0, length - 1, inorderIndexMap);
    }

    private TreeNode recursive(int[] preorder, int preorderStart, int preorderEnd, int inorderStart,
                               int inorderEnd, Map<Integer, Integer> indexMap) {
        if (preorderStart > preorderEnd || inorderStart > inorderEnd) {
            return null;
        }

        int rootVal = preorder[preorderStart];
        TreeNode rootNode = new TreeNode(rootVal);
        if (preorderStart != preorderEnd) {
            int rootIndex = indexMap.get(rootVal);
            rootNode.left = recursive(preorder, preorderStart + 1, preorderStart + rootIndex - inorderStart, inorderStart, rootIndex - 1, indexMap);
            rootNode.right = recursive(preorder, preorderEnd - (inorderEnd - rootIndex) + 1, preorderEnd, rootIndex + 1, inorderEnd, indexMap);
        }
        return rootNode;
    }

    /**
     * iteration
     * O(n) O(n)
     */
    public TreeNode buildTree0102(int[] preorder, int[] inorder) {
        if (paramsInvalid(preorder, inorder)) {
            return null;
        }

        TreeNode topNode;
        TreeNode rootNode = new TreeNode(preorder[0]);
        Stack<TreeNode> used = new Stack<>();
        used.push(rootNode);
        int inorderIndex = 0;
        int preorderVal;
        int length = preorder.length;

        for (int i = 1; i < length; i++) {
            topNode = used.peek();
            preorderVal = preorder[i];
            if (topNode.val != inorder[inorderIndex]) {
                topNode.left = new TreeNode(preorderVal);
                used.push(topNode.left);
            } else {
                while (!used.isEmpty() && used.peek().val == inorder[inorderIndex]) {
                    topNode = used.pop();
                    inorderIndex++;
                }
                topNode.right = new TreeNode(preorderVal);
                used.push(topNode.right);
            }
        }

        return rootNode;
    }

    private boolean paramsInvalid(int[] preorder, int[] inorder) {
        return preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0;
    }
}

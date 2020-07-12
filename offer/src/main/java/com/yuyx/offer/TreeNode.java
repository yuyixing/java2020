package com.yuyx.offer;

import java.util.*;

/**
 * Definition for a binary tree node.
 *
 * @author yuyx
 */
public class TreeNode {
    private static int index;
    public Integer val;
    public TreeNode parent;
    public TreeNode left;
    public TreeNode right;
    public int size;

    public TreeNode() {
    }

    public TreeNode(Integer x) {
        if (x != null) {
            val = x;
        }
    }

    /**
     * 需用null补充树,使得所有叶结点都为null
     */
    public static TreeNode createTreeNodeByPreorder(Integer[] integers) {
        boolean isEmptyTree = integers == null || integers.length == 0 || integers[0] == null;
        if (isEmptyTree) {
            return new TreeNode();
        }

        return createByPreorderRecursive(integers);
    }

    private static TreeNode createByPreorderRecursive(Integer[] integers) {
        Integer val = integers[index++];
        if (val == null) {
            return null;
        }
        TreeNode node = new TreeNode(val);
        node.left = createByPreorderRecursive(integers);
        node.right = createByPreorderRecursive(integers);
        return node;
    }

    public static TreeNode createTreeNodeByLevelOrder(Integer[] integers) {
        boolean isEmptyTree = integers == null || integers.length == 0 || integers[0] == null;
        if (isEmptyTree) {
            return new TreeNode();
        }

        TreeNode root = null;
        TreeNode node;
        TreeNode parentNode;
        List<TreeNode> list = new ArrayList<>();

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == null) {
                list.add(null);
                continue;
            }
            node = new TreeNode(integers[i]);
            if (i == 0) {
                root = node;
            } else {
                if (i % 2 == 1) {
                    parentNode = list.get(i / 2);
                    parentNode.left = node;
                } else {
                    parentNode = list.get((i - 1) / 2);
                    parentNode.right = node;
                }
                node.parent = parentNode;
            }
            list.add(node);
            root.size++;
        }

        return root;
    }

    public static TreeNode createTreeNodeByLevelOrder2(Integer[] integers) {
        if (integers == null || integers.length == 0 || integers[0] == null) {
            return new TreeNode();
        }

        List<TreeNode> list = new ArrayList<>();
        createByLevelOrderRecursive(integers, 0, list);

        return list.get(0);
    }

    private static void createByLevelOrderRecursive(Integer[] integers, int index, List<TreeNode> list) {
        if (index >= integers.length) {
            return;
        }

        TreeNode parentNode;
        TreeNode node;

        if (integers[index] == null) {
            list.add(null);
        } else {
            node = new TreeNode(integers[index]);
            if (index != 0) {
                boolean isOdd = index % 2 == 1;
                if (isOdd) {
                    parentNode = list.get(index / 2);
                    parentNode.left = node;
                } else {
                    parentNode = list.get((index - 1) / 2);
                    parentNode.right = node;
                }
                node.parent = parentNode;
            }
            list.add(node);
            list.get(0).size++;
        }
        createByLevelOrderRecursive(integers, ++index, list);
    }

    public int[] getPreorderTraversal() {
        List<Integer> list = new ArrayList<>();
        preorderRecursive(this, list);
        return Utils.listToInts(list);
    }

    private void preorderRecursive(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        preorderRecursive(node.left, list);
        preorderRecursive(node.right, list);
    }

    public int[] getPreorderIteration() {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(this);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
                stack.push(node);
                stack.push(null);
            } else {
                list.add(stack.pop().val);
            }
        }

        return Utils.listToInts(list);
    }

    public int[] getInorderTraversal() {
        List<Integer> list = new ArrayList<>();
        inorderRecursive(this, list);
        return Utils.listToInts(list);
    }

    private void inorderRecursive(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        inorderRecursive(node.left, list);
        list.add(node.val);
        inorderRecursive(node.right, list);
    }

    public int[] getInorderIteration() {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(this);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (node.right != null) {
                    stack.push(node.right);
                }
                stack.push(node);
                stack.push(null);
                if (node.left != null) {
                    stack.push(node.left);
                }
            } else {
                list.add(stack.pop().val);
            }
        }

        return Utils.listToInts(list);
    }

    public int[] getPostorderTraversal() {
        List<Integer> list = new ArrayList<>();
        postorderRecursive(this, list);
        return Utils.listToInts(list);
    }

    private void postorderRecursive(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        postorderRecursive(node.left, list);
        postorderRecursive(node.right, list);
        list.add(node.val);
    }

    public int[] getPostorderIteration() {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(this);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                stack.push(node);
                stack.push(null);
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            } else {
                list.add(stack.pop().val);
            }
        }

        return Utils.listToInts(list);
    }

    public int[] getLevelOrderTraversal() {
        return Utils.listsToInts(this.getLevelOrderLists());
    }

    public int[][] getLevelOrderTraversal2D() {
        return Utils.listsTo2dInts(this.getLevelOrderLists());
    }

    public List<List<Integer>> getLevelOrderLists() {
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(this);
        List<Integer> list;
        while (!queue.isEmpty()) {
            int size = queue.size();
            list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node == null) {
                    continue;
                }
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public TreeNode getSubTreeNodeByPreorder(int val) {
        return subTreeNodePreorderRecursive(this, val);
    }

    private TreeNode subTreeNodePreorderRecursive(TreeNode node, int val) {
        if (node == null) {
            return null;
        }

        if (node.val == val) {
            return node;
        }

        TreeNode treeNode = subTreeNodePreorderRecursive(node.left, val);
        if (treeNode != null) {
            return treeNode;
        }
        treeNode = subTreeNodePreorderRecursive(node.right, val);
        return treeNode;
    }

    public TreeNode getSubTreeNodeByInorder(int val) {
        return subTreeNodeInorderRecursive(this, val);
    }

    private TreeNode subTreeNodeInorderRecursive(TreeNode node, int val) {
        if (node == null) {
            return null;
        }

        TreeNode treeNode = subTreeNodePreorderRecursive(node.left, val);
        if (treeNode != null) {
            return treeNode;
        }
        if (node.val == val) {
            return node;
        }
        treeNode = subTreeNodePreorderRecursive(node.right, val);
        return treeNode;
    }

    public TreeNode getSubTreeNodeByPostorder(int val) {
        return subTreeNodePostorderRecursive(this, val);
    }

    private TreeNode subTreeNodePostorderRecursive(TreeNode node, int val) {
        if (node == null) {
            return null;
        }

        TreeNode treeNode = subTreeNodePostorderRecursive(node.left, val);
        if (treeNode != null) {
            return treeNode;
        }
        treeNode = subTreeNodePostorderRecursive(node.right, val);
        if (treeNode != null) {
            return treeNode;
        }
        if (node.val == val) {
            return node;
        }
        return null;
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
        return (this.val.equals(treeNode.val))
                && (this.left == null || this.left.equals(treeNode.left))
                && (this.right == null || this.right.equals(treeNode.right))
                && (treeNode.left == null || treeNode.left.equals(this.left))
                && (treeNode.right == null || treeNode.right.equals(this.right));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.val, this.left, this.right);
    }

}

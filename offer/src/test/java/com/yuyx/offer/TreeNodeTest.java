package com.yuyx.offer;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeNodeTest {
    private TreeNode treeNode;

    @BeforeAll
    static void init() {
    }

    @AfterAll
    static void done() {
    }

    @BeforeEach
    void setUp() {
        treeNode = TreeNode.createTreeNodeByLevelOrder(new Integer[]{1, 2, 3, 4, 5, 6, 7, null, null, 8, 9});
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void doNothing() {
    }

    @Test
    void testEquals() {
        TreeNode expected = TreeNode.createTreeNodeByLevelOrder(new Integer[]{1, 2, 3, 4, 5, 6, 7, null, null, 8, 9});
        assertEquals(expected, treeNode);
    }

    @Test
    void testPreorderTraversal() {
        int[] expected = {1, 2, 4, 5, 8, 9, 3, 6, 7};
        assertArrayEquals(expected, treeNode.getPreorderTraversal());
    }

    @Test
    void getPreorderIteration() {
        int[] expected = {1, 2, 4, 5, 8, 9, 3, 6, 7};
        assertArrayEquals(expected, treeNode.getPreorderIteration());
    }

    @Test
    void testInorderTraversal() {
        int[] expected = {4, 2, 8, 5, 9, 1, 6, 3, 7};
        assertArrayEquals(expected, treeNode.getInorderTraversal());
    }

    @Test
    void getInorderIteration() {
        int[] expected = {4, 2, 8, 5, 9, 1, 6, 3, 7};
        assertArrayEquals(expected, treeNode.getInorderIteration());
    }

    @Test
    void testPostorderTraversal() {
        int[] expected = {4, 8, 9, 5, 2, 6, 7, 3, 1};
        assertArrayEquals(expected, treeNode.getPostorderTraversal());
    }

    @Test
    void getPostorderIteration() {
        int[] expected = {4, 8, 9, 5, 2, 6, 7, 3, 1};
        assertArrayEquals(expected, treeNode.getPostorderIteration());
    }

    @Test
    void testCreateTreeNodeByPreorder() {
        Integer[] integers = {1, 2, 4, null, null, 5, 8, null, null, 9, null, null, 3, 6, null, null, 7, null, null};
        TreeNode expected = TreeNode.createTreeNodeByPreorder(integers);
        assertEquals(expected, treeNode);
    }

    @Test
    void testCreateTreeNodeByLevelOrder() {
        TreeNode expected = new TreeNode(1);
        expected.left = new TreeNode(2);
        expected.right = new TreeNode(3);
        expected.left.left = new TreeNode(4);
        expected.left.right = new TreeNode(5);
        expected.right.left = new TreeNode(6);
        expected.right.right = new TreeNode(7);
        expected.left.right.left = new TreeNode(8);
        expected.left.right.right = new TreeNode(9);

        assertEquals(expected, treeNode);
    }

    @Test
    void testCreateTreeNodeByLevelOrder2() {
        TreeNode expected = new TreeNode(1);
        expected.left = new TreeNode(2);
        expected.right = new TreeNode(3);
        expected.left.right = new TreeNode(5);
        expected.right.left = new TreeNode(6);
        expected.right.right = new TreeNode(7);
        expected.left.right.left = new TreeNode(8);
        expected.left.right.right = new TreeNode(9);

        Integer[] integers = {1, 2, 3, null, 5, 6, 7, null, null, 8, 9};
        assertEquals(expected, TreeNode.createTreeNodeByLevelOrder2(integers));
    }

    @Test
    void testLevelOrderTraversalLists() {
        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        List<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(5);
        list3.add(6);
        list3.add(7);
        List<Integer> list4 = new ArrayList<>();
        list4.add(8);
        list4.add(9);
        expected.add(list1);
        expected.add(list2);
        expected.add(list3);
        expected.add(list4);

        assertEquals(expected, treeNode.getLevelOrderLists());
    }

    @Test
    void testLevelOrderTraversal2D() {
        int[][] expected = {{1}, {2, 3}, {4, 5, 6, 7}, {8, 9}};
        assertArrayEquals(expected, treeNode.getLevelOrderTraversal2D());
    }

    @Test
    void testLevelOrderTraversal() {
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, treeNode.getLevelOrderTraversal());
    }

    @Test
    void testTreeNodeSize() {
        int expected = 9;
        assertEquals(expected, treeNode.size);
    }

    @Test
    void testTreeNodeSize2() {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, null, null, 8, null};
        int expected = 8;
        assertEquals(expected, TreeNode.createTreeNodeByLevelOrder(integers).size);
    }
}
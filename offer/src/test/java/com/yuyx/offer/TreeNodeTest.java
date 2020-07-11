package com.yuyx.offer;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeNodeTest {
    private TreeNode expectedTree;

    @BeforeAll
    static void init() {
    }

    @AfterAll
    static void done() {
    }

    @BeforeEach
    void setUp() {
        expectedTree = TreeNode.createTreeNodeByLevelOrder(new Integer[]{1, 2, 3, 4, 5, 6, 7, null, null, 8, 9});
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void doNothing() {
    }

    @Test
    void testEquals() {
        assertEquals(expectedTree, TreeNode.createTreeNodeByLevelOrder(new Integer[]{1, 2, 3, 4, 5, 6, 7, null, null, 8, 9}));
    }

    @Test
    void testPreorder() {
        assertArrayEquals(new int[]{1, 2, 4, 5, 8, 9, 3, 6, 7}, expectedTree.getPreorder());
    }

    @Test
    void getPreorderIteration() {
        assertArrayEquals(new int[]{1, 2, 4, 5, 8, 9, 3, 6, 7}, expectedTree.getPreorderIteration());
    }

    @Test
    void testInorder() {
        assertArrayEquals(new int[]{4, 2, 8, 5, 9, 1, 6, 3, 7}, expectedTree.getInorder());
    }

    @Test
    void getInorderIteration() {
        assertArrayEquals(new int[]{4, 2, 8, 5, 9, 1, 6, 3, 7}, expectedTree.getInorderIteration());
    }

    @Test
    void testPostorder() {
        assertArrayEquals(new int[]{4, 8, 9, 5, 2, 6, 7, 3, 1}, expectedTree.getPostorder());
    }

    @Test
    void getPostorderIteration() {
        assertArrayEquals(new int[]{4, 8, 9, 5, 2, 6, 7, 3, 1}, expectedTree.getPostorderIteration());
    }

    @Test
    void testCreateTreeNodeByPreorder() {
        Integer[] integers = new Integer[]{1, 2, 4, null, null, 5, 8, null, null, 9, null, null, 3, 6, null, null, 7, null, null};
        assertEquals(expectedTree, TreeNode.createTreeNodeByPreorder(integers));
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

        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, null, null, 8, 9};
        assertEquals(expected, TreeNode.createTreeNodeByLevelOrder(integers));
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

        Integer[] integers = new Integer[]{1, 2, 3, null, 5, 6, 7, null, null, 8, 9};
        assertEquals(expected, TreeNode.createTreeNodeByLevelOrder2(integers));
    }

    @Test
    void testLevelOrderLists() {
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

        assertEquals(expected, expectedTree.getLevelOrderLists());
    }

    @Test
    void testLevelOrder() {
        int[][] expected = new int[][]{{1}, {2, 3}, {4, 5, 6, 7}, {8, 9}};
        assertArrayEquals(expected, expectedTree.getLevelOrder());
    }

    @Test
    void testTreeNodeSize() {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, null, null, 8, 9};
        assertEquals(9, TreeNode.createTreeNodeByLevelOrder(integers).size);
    }

    @Test
    void testTreeNodeSize2() {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, null, null, 8, null};
        assertEquals(8, TreeNode.createTreeNodeByLevelOrder(integers).size);
    }
}
package com.yuyx.offer;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Offer07Test {
    private Offer07 offer;
    private TreeNode tree;

    @BeforeAll
    static void init() {
    }

    @AfterAll
    static void done() {
    }

    @BeforeEach
    void setUp() {
        offer = new Offer07();
        tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);
        tree = TreeNode.createTreeNodeByLevelOrder(new Integer[]{3, 9, 20, null, null, 15, 7});
    }

    @AfterEach
    void tearDown() {
        offer = null;
    }

    @Test
    void doNothing() {
    }

    @Test
    void getRepeat0101() {
        assertEquals(tree, offer.buildTree0101(tree.getPreorder(), tree.getInorder()));
    }

    @Test
    void getRepeat0102() {
        assertEquals(tree, offer.buildTree0102(tree.getPreorder(), tree.getInorder()));
    }
}
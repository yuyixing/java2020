package com.yuyx.offer;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Offer07Test {
    private Offer07 offer;
    private TreeNode expected;

    @BeforeAll
    static void init() {
    }

    @AfterAll
    static void done() {
    }

    @BeforeEach
    void setUp() {
        offer = new Offer07();
        expected = new TreeNode(3);
        expected.left = new TreeNode(9);
        expected.right = new TreeNode(20);
        expected.right.left = new TreeNode(15);
        expected.right.right = new TreeNode(7);
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
        TreeNode actual = offer.buildTree0101(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        assertEquals(expected, actual);
    }

    @Test
    void getRepeat0102() {
        TreeNode actual = offer.buildTree0102(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        assertEquals(expected, actual);
    }
}
package com.yuyx.offer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Offer08Test {
    private Offer08 offer;
    private TreeNode treeNode;

    @BeforeEach
    void setUp() {
        offer = new Offer08();
        treeNode = TreeNode.createTreeNodeByLevelOrder(new Integer[]{1, 2, 3, 4, 5, 6, 7, null, null, 8, 9});
    }

    @AfterEach
    void tearDown() {
        offer = null;
    }

    @Test
    void tesGetNextNodeByPreorder() {
        assertEquals(treeNode.getSubTreeNodeByPreorder(3), offer.getNextNodeByPreorder(treeNode, 9));
        assertNull(offer.getNextNodeByPreorder(treeNode, 7));
    }

    @Test
    void testGetNextNodeByInorder() {
        assertEquals(treeNode.getSubTreeNodeByPreorder(1), offer.getNextNodeByInorder(treeNode, 9));
        assertNull(offer.getNextNodeByInorder(treeNode, 7));
    }

    @Test
    void testGetNextNodeByPostorder() {
        assertEquals(treeNode.getSubTreeNodeByPreorder(5), offer.getNextNodeByPostorder(treeNode, 9));
        assertNull(offer.getNextNodeByPostorder(treeNode, 1));
    }
}
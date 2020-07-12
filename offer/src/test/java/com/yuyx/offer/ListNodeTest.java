package com.yuyx.offer;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListNodeTest {
    private ListNode listNode;

    @BeforeAll
    static void init() {
    }

    @AfterAll
    static void done() {
    }

    @BeforeEach
    void setUp() {
        listNode = ListNode.createListNodeWithInts(new int[]{1, 2, 3});
    }

    @Test
    void testCreateListNodeWithInts() {
        ListNode expected = new ListNode(1);
        expected.setNext(new ListNode(2));
        expected.getNext().setNext(new ListNode(3));

        assertEquals(expected, listNode);
    }
}
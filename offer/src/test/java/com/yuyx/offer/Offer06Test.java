package com.yuyx.offer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Offer06Test {
    private Offer06 offer;
    private ListNode head;

    @BeforeEach
    void setUp() {
        offer = new Offer06();
        ListNode node;
        for (int i = 10; i > 0; i--) {
            node = new ListNode(i);
            node.setNext(head);
            head = node;
        }
    }

    @AfterEach
    void tearDown() {
        offer = null;
    }

    @Test
    void getRepeat0101() {
        assertArrayEquals(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, offer.reversePrint0101(head));
    }

    @Test
    void getRepeat0102() {
        assertArrayEquals(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, offer.reversePrint0102(head));
    }

    @Test
    void getRepeat0103() {
        assertArrayEquals(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, offer.reversePrint0103(head));
    }

    @Test
    void getRepeat0104() {
        assertArrayEquals(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, offer.reversePrint0104(head));
    }

}
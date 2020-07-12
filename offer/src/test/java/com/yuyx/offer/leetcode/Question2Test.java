package com.yuyx.offer.leetcode;

import com.yuyx.offer.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question2Test {
    private Question2 q;

    @BeforeEach
    void setUp() {
        q = new Question2();
    }

    @Test
    void testAddTwoNumbers() {
        ListNode l1 = ListNode.createListNodeWithInts(new int[]{2, 4, 3});
        ListNode l2 = ListNode.createListNodeWithInts(new int[]{5, 6, 4});
        ListNode expected = ListNode.createListNodeWithInts(new int[]{7, 0, 8});

        assertEquals(expected, q.addTwoNumbers(l1, l2));
    }

}
package com.yuyx.offer.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Question1Test {
    private Question1 q;

    @BeforeEach
    void setUp() {
        q = new Question1();
    }

    @Test
    void testTwoSum() {
        assertArrayEquals(new int[]{0, 1}, q.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void testTwoSumTwoTimeHash() {
        assertArrayEquals(new int[]{0, 1}, q.twoSumTwoTimeHash(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void testTwoSumOneTimeHash() {
        assertArrayEquals(new int[]{0, 1}, q.twoSumOneTimeHash(new int[]{2, 7, 11, 15}, 9));
    }
}
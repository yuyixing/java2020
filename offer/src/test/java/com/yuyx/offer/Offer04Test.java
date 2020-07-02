package com.yuyx.offer;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Offer04Test {
    private Offer04 offer;
    private int[][] nums;

    @BeforeAll
    static void init() {
    }

    @AfterAll
    static void done() {
    }

    @BeforeEach
    void setUp() {
        offer = new Offer04();
        nums = new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}};
    }

    @AfterEach
    void tearDown() {
        offer = null;
        nums = null;
    }

    @Test
    void doNothing() {
    }

    @Test
    void getRepeat0101() {
        assertTrue(offer.findNumberIn2dArray0101(nums, 7));
        assertFalse(offer.findNumberIn2dArray0101(nums, 5));
    }

    @Test
    void getRepeat0102() {
        assertTrue(offer.findNumberIn2dArray0102(nums, 7));
        assertFalse(offer.findNumberIn2dArray0102(nums, 5));
    }
}
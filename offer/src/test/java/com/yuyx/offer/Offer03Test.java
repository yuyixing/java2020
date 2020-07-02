package com.yuyx.offer;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Testing using JUnit 5")
class Offer03Test {
    private Offer03 offer;
    private int[] nums;

    @BeforeAll
    static void init() {
        // Do something before ANY test is run in this class
//        LocalDateTime ldt = LocalDateTime.now();
//        assumeTrue(ldt.getDayOfWeek().getValue() == 5);   //前置条件
    }

    @AfterAll
    static void done() {
        // Do something after ALL tests in this class are run
    }

    @BeforeEach
    void setUp() {
        offer = new Offer03();
        nums = new int[]{2, 3, 1, 0, 2, 5, 3};
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
        assertTrue(Arrays.binarySearch(new int[]{2, 3}, offer.getRepeat0101(nums)) >= 0);
    }

    @Test
    void getRepeat0102() {
        assertTrue(Arrays.binarySearch(new int[]{2, 3}, offer.getRepeat0102(nums)) >= 0);
    }

    @Test
    void getRepeat0103() {
        assertTrue(Arrays.binarySearch(new int[]{2, 3}, offer.getRepeat0103(nums)) >= 0);
    }

    @Test
    void getRepeat0104() {
        assertTrue(Arrays.binarySearch(new int[]{2, 3}, offer.getRepeat0104(nums)) >= 0);
    }

    @Test
    void getRepeat0201() {
        assertTrue(Arrays.binarySearch(new int[]{2, 3, 6}, offer.getRepeat0201(nums)) >= 0);
    }

    @Test
    void getRepeat0202() {
        assertTrue(Arrays.binarySearch(new int[]{2, 3, 6}, offer.getRepeat0202(nums)) >= 0);
    }
}
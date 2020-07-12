package com.yuyx.offer;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayName("Testing using JUnit 5")
class Offer03Test {
    private Offer03 offer;
    private int[] nums;
    private static final int REPEAT_COUNT = 1;

    @BeforeAll
    static void init() {
        LocalDateTime ldt = LocalDateTime.now();
//        assumeTrue(ldt.getDayOfWeek().getValue() == 5);   //前置条件
        assumeTrue(ldt.getDayOfYear() != 1);
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

    @RepeatedTest(value = REPEAT_COUNT, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("Repeat!")
    void getRepeat0101() {
        assertTrue(Arrays.binarySearch(new int[]{2, 3}, offer.getRepeat0101(nums)) >= 0);
    }

    @RepeatedTest(REPEAT_COUNT)
    void getRepeat0102() {
        assertTrue(Arrays.binarySearch(new int[]{2, 3}, offer.getRepeat0102(nums)) >= 0);
    }

    @RepeatedTest(REPEAT_COUNT)
    void getRepeat0103() {
        assertTrue(Arrays.binarySearch(new int[]{2, 3}, offer.getRepeat0103(nums)) >= 0);
    }

    @RepeatedTest(REPEAT_COUNT)
    void getRepeat0104() {
        assertTrue(Arrays.binarySearch(new int[]{2, 3}, offer.getRepeat0104(nums)) >= 0);
    }

    @RepeatedTest(REPEAT_COUNT)
    void getRepeat0201() {
        assertTrue(Arrays.binarySearch(new int[]{2, 3, 6}, offer.getRepeat0201(nums)) >= 0);
    }

    @RepeatedTest(REPEAT_COUNT)
    void getRepeat0202() {
        assertTrue(Arrays.binarySearch(new int[]{2, 3, 6}, offer.getRepeat0202(nums)) >= 0);
    }
}
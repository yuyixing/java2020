package com.yuyx.offer;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Offer05Test {
    private Offer05 offer;
    private String before;
    private String after;

    @BeforeAll
    static void init() {
    }

    @AfterAll
    static void done() {
    }

    @BeforeEach
    void setUp() {
        offer = new Offer05();
        before = "We are happy.";
        after = "We%20are%20happy.";
    }

    @AfterEach
    void tearDown() {
        offer = null;
        before = null;
        after = null;
    }

    @Test
    void doNothing() {
    }

    @Test
    void getRepeat0101() {
        assertEquals(after, offer.replaceSpace0101(before));
    }

    @Test
    void getRepeat0102() {
        assertEquals(after, offer.replaceSpace0102(before));
    }

    @Test
    void getRepeat0103() {
        assertEquals(after, offer.replaceSpace0103(before));
    }

    @Test
    void getRepeat0104() {
        assertEquals(after, offer.replaceSpace0104(before));
    }

    @Test
    void getRepeat0105() {
        assertEquals(after, offer.replaceSpace0105(before));
    }

}
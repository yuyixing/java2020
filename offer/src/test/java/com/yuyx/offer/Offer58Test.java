package com.yuyx.offer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Offer58Test {

    private Offer58 offer;

    @BeforeEach
    void setUp() {
        offer = new Offer58();
    }

    @AfterEach
    void tearDown() {
        offer = null;
    }

    @Test
    void testReverseLeftWords0101() {
        assertEquals("cdefgab", offer.reverseLeftWords0101("abcdefg", 2));
    }

    @Test
    void testReverseLeftWords0102() {
        assertEquals("cdefgab", offer.reverseLeftWords0102("abcdefg", 2));
    }

    @Test
    void testReverseLeftWords0103() {
        assertEquals("cdefgab", offer.reverseLeftWords0103("abcdefg", 2));
    }
}
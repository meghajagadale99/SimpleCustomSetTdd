package com.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public
class CustomSetTest {

    private CustomSet customSet;

    @BeforeEach
    void setUp() {
        customSet = new CustomSet();
    }

    @Test
    void shouldReturnTrueWhenSetIsEmpty() {
        assertTrue(customSet.isEmpty());
    }

    @Test
    void shouldReturnFalseWhenSetIsNotEmpty() {
        customSet.add(1);
        assertFalse(customSet.isEmpty());
    }
}

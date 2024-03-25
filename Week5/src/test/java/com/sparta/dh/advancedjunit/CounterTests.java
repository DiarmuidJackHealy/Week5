package com.sparta.dh.advancedjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CounterTests {
    private static Counter counter;

    @BeforeEach
    void setup() {
        counter = new Counter(6);
    }

    @Test
    @DisplayName("decrement counter by 1")
    void decrementCounterByOne() {
        counter.decrement();
        Assertions.assertEquals(5, counter.getCount());
    }

    @Test
    @DisplayName("increment counter by 1")
    void incrementCounterByOne() {
        counter.increment();
        Assertions.assertEquals(7, counter.getCount());
    }
}

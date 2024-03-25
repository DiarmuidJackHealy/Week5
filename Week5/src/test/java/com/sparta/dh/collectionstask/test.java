package com.sparta.dh.collectionstask;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.HashSet;

public class test {
    @Test
    @DisplayName("Returns a Hash Set with values 5, 10, 15, 20")
    void numsTest1() {
        HashSet<Integer> expectedResult = new HashSet<>();
        expectedResult.add(5);
        expectedResult.add(10);
        expectedResult.add(15);
        expectedResult.add(20);
        Assertions.assertEquals(expectedResult, App.makeFiveSet(20));
    }

    @Test
    @DisplayName("Returns an empty Hash Set")
    void numsTest2() {
        HashSet<Integer> expectedResult = new HashSet<>();
        Assertions.assertEquals(expectedResult, App.makeFiveSet(4));
    }

    @Test
    @DisplayName("Returns a list with the values Hello, Keeping, today")
    void wordTest1() {
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Hello");
        expectedResult.add("keeping");
        expectedResult.add("today");
        Assertions.assertEquals(expectedResult, App.longWordList("Hello dj! How are you keeping today son?"));
    }

    @Test
    @DisplayName("Returns an empty Array List")
    void wordTest2() {
        ArrayList<String> expectedResult = new ArrayList<>();
        Assertions.assertEquals(expectedResult, App.longWordList("lee i am"));
    }
}

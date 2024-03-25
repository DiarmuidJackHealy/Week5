package com.sparta.dh.advancedjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TDDTests {
    //Red, Green, Refactor
    //1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz

    //1. write a failing test!!
    //2. write just enough code to pass the test
    //3. Refactor so that all previous tests pass

    @Test
    @DisplayName("check that 2 returns 2")
    void checkThatTwoReturnsTwo() {
        Assertions.assertEquals("2", TDD.getFizzBuzzValue(2));
    }

    @Test
    @DisplayName("check that 3 returns 'Fizz'")
    void checkThatThreeReturnsFizz() {
        Assertions.assertEquals("Fizz", TDD.getFizzBuzzValue(3));
    }

    @Test
    @DisplayName("check that 4 returns 4")
    void checkThatFourReturnsFour() {
        Assertions.assertEquals("4", TDD.getFizzBuzzValue(4));
    }

    @Test
    @DisplayName("check that 5 returns 'Buzz'")
    void checkThatFiveReturnsBuzz() {
        Assertions.assertEquals("Buzz", TDD.getFizzBuzzValue(5));
    }

    @Test
    @DisplayName("check that 6 returns 6")
    void checkThatSixReturnsFizz() {
        Assertions.assertEquals("Fizz", TDD.getFizzBuzzValue(6));
    }

    @Test
    @DisplayName("check that 7 returns 7")
    void checkThatSevenReturnsSeven() {
        Assertions.assertEquals("7", TDD.getFizzBuzzValue(7));
    }

    @Test
    @DisplayName("check that 8 returns 8")
    void checkThatEightReturnsEight() {
        Assertions.assertEquals("8", TDD.getFizzBuzzValue(8));
    }

    @Test
    @DisplayName("check that 9 returns Fizz")
    void checkThatNineReturnsFizz() {
        Assertions.assertEquals("Fizz", TDD.getFizzBuzzValue(9));
    }

    @Test
    @DisplayName("check that 10 returns 'Buzz'")
    void checkThatTenReturnsBuzz() {
        Assertions.assertEquals("Buzz", TDD.getFizzBuzzValue(10));
    }

    @Test
    @DisplayName("check that 11 returns 11")
    void checkThatElevenReturnsEleven() {
        Assertions.assertEquals("11", TDD.getFizzBuzzValue(11));
    }

    @Test
    @DisplayName("check that 12 returns 12")
    void checkThatTwelveReturnsFizz() {
        Assertions.assertEquals("Fizz", TDD.getFizzBuzzValue(12));
    }

    @Test
    @DisplayName("check that 13 returns 13")
    void checkThatThirteenReturnsThirteen() {
        Assertions.assertEquals("13", TDD.getFizzBuzzValue(13));
    }

    @Test
    @DisplayName("check that 13 returns 13")
    void checkThatFourteenReturnsFourteen() {
        Assertions.assertEquals("14", TDD.getFizzBuzzValue(14));
    }

    @Test
    @DisplayName("check that 15 returns 'FizzBuzz'")
    void checkThatFifteenReturnsFizzBuzz() {
        Assertions.assertEquals("FizzBuzz", TDD.getFizzBuzzValue(15));
    }

    @Test
    @DisplayName("check that 15 returns 'FizzBuzz'")
    void checkThatThirtyReturnsFizzBuzz() {
        Assertions.assertEquals("FizzBuzz", TDD.getFizzBuzzValue(30));
    }
}

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
}

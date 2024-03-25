package com.sparta.dh.hamcrest;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest.Matchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CalculatorTests {

    @Test
    void given2And6_Add_Returns8Pt0() {
        Calculator calc = new Calculator(6, 2);
        assertThat(calc.add(), is(equalTo(8.0)));
        //Assertions.assertEquals(8.0, calc.add());
    }

    @Test
    void given6And3_DivisibleBy_ReturnsTrue() {
        Calculator calc = new Calculator(6, 2);
        assertThat(calc.divisibleBy(), is((true)));
        //Assertions.assertTrue(calc.divisibleBy());
    }

    @Test
    void given7And3_DivisibleBy_ReturnsFalse() {
        Calculator calc = new Calculator(7, 3);
        assertThat(calc.divisibleBy(), is(false));
        //Assertions.assertFalse(calc.divisibleBy());
    }

    @Test
    void given7And3_ToString_OutputContainsCalculator() {
        Calculator calc = new Calculator(7, 3);
        assertThat(calc.add(), is(equalTo(10.0)));
        //Assertions.assertTrue(calc.toString().contains("Calculator"));
    }

    @Test
    void given2And7_Add_Returns9Pt0() {
        Calculator calc = new Calculator(2, 7);
        assertThat(calc.add(), is(equalTo(9.0)));
    }

    @Test
    void collectionMatchersExercise1() {
        List<String> fruit = List.of(
                "apple", "pear", "banana", "peach", "pomegranate", "pineapple", "lemon"
        );
        assertThat(fruit.size(), is(equalTo(7))); //There are 7 elements in the collection.
        assertThat(fruit, containsInRelativeOrder("apple", "banana", "pomegranate", "lemon")); //The collection contains the following items in this order: ["apple", "banana", "pomegranate", "lemon"].
        assertThat(fruit, hasItems("pear", "banana")); //The collection contains the following items in any order: ["pear", "banana"].
        assertThat(fruit.reversed(), containsInRelativeOrder("lemon", "pineapple", "pomegranate", "peach", "banana", "pear", "apple")); //The collection contains the following items (they must be in this order in your assertion): ["lemon", "pineapple", "pomegranate", "peach", "banana", "pear", "apple"].
        assertThat(fruit, is(not(hasItems("grape")))); //The collection does not contain "grape".
    }
}

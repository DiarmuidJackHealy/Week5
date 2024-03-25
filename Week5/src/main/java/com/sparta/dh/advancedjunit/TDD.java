package com.sparta.dh.advancedjunit;

public class TDD {
    public static String getFizzBuzzValue(int num) {
        if(num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0){
            return "Fizz";
        } else if(num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}

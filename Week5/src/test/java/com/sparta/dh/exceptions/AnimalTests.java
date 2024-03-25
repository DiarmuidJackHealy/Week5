package com.sparta.dh.exceptions;

import com.sparta.dh.exceptions.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class AnimalTests {

    @Test
    void checkThatDOBCanBeSet () {
        Animal a = new Animal();
        Assertions.assertThrows(ParseException.class,() -> a.setDob("ooo"));
    }

}

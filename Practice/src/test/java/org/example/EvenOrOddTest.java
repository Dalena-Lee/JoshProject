package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    @Test
    void EvenNumbers() {
        Practice practice = new Practice();
        String expected = "even";
        String actual = practice.EvenOrOdd(2);

        Assert.assertEquals(expected, actual);

        expected = "odd";
        actual = practice.EvenOrOdd(3);

        Assert.assertTrue(expected.equalsIgnoreCase(actual));
    }

    @Test
    void OddNumbers() {
        Practice practice = new Practice();

        String expected = "odd";
        String actual = practice.EvenOrOdd(3);

        Assert.assertTrue(expected.equalsIgnoreCase(actual));
    }


}
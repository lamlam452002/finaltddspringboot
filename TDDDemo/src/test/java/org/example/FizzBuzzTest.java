package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    public FizzBuzz fizzBuzz;

    @Before
    public void Setup() {
        fizzBuzz = new FizzBuzz();
    }
    @Test(expected = IllegalArgumentException.class)
    public void should_return_exception_with_invalid_argument() {
        fizzBuzz.getFizzBuzz(-1);
        fizzBuzz.getFizzBuzz(0);
    }

    public void should_return_fizz_buzz_with_number_3() {
        //Arrange
        String expected = "1, 2, Fizz";

        //Action
        String result = fizzBuzz.getFizzBuzz(3);

        //Arrsertion
        Assert.assertEquals(expected, result);
    }
}

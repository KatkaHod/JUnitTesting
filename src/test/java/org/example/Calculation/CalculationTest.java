package org.example.Calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculationTest {

    /* Every test is a method that returns no value
     * The title should make it clear which method from the class is being tested
     * -> no need to test methods in main, but just create tests for individual classes
     * -> add in the end: Assertions.assertEquals(expected,actual);

     #If there is an error in the test, check the method and then check if there is an error in the expected value
     */

    @Test
    @DisplayName("Test souctu dvou kladnych cisel")
    public void testScitani() {
       int actual= Calculation.scitani(2,3);
       int expected = 5;

        Assertions.assertEquals(expected,actual);
    }


    @Test
    @DisplayName("Test odecitani dvou kladnych cisel")
    public void testOdcitani() {
        int actual = Calculation.odcitani(5,3);
        int expected = 2;

        Assertions.assertEquals(expected,actual);
    }


    @Test
    @DisplayName("Test nasobeni dvou kladnych cisel")
    public void testNasobeni() {
        int actual = Calculation.nasobeni(5,3);
        int expected = 15;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test deleni dvou kladnych cisel")
    public void testDeleni(){
        int actual = Calculation.deleni(20,5);
        int expected = 4;

        Assertions.assertEquals(expected,actual);

    }

    /*
    This test verifies that an ArithmeticException is thrown when dividing by zero,
    Using a lambda expression to execute the division only when assertThrows checks for the exception.
     */

    @Test
    @DisplayName("Test deleni nulou -> nelze delit nulou")
    public void testDeleniZero() {
        Exception excepted = Assertions.assertThrows(ArithmeticException.class, () -> Calculation.deleni(12, 0));
        Assertions.assertEquals("/ by zero", excepted.getMessage());
    }






}

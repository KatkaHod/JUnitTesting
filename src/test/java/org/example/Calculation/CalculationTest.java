package org.example.Calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculationTest {

    /* Every test is a method that returns no value
     * The title should make it clear which method from the class is being tested
     * -> no need to test methods in main, but just create tests for individual classes
     * -> add in the end: Assertions.assertEquals(expected,actual);

     #If there is an error in the test, check the method and then check if there is an error in the expected value
     */

    @Test
    public void testScitani() {
       int actual= Calculation.scitani(2,3);
       int expected = 5;

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void testOdcitani() {
        int actual = Calculation.odcitani(5,3);
        int expected = 2;

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void testNasobeni() {
        int actual = Calculation.nasobeni(5,3);
        int expected = 15;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testDeleni(){
        int actual = Calculation.deleni(20,5);
        int expected = 4;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testDeleniNulou(){
        //Exception excepted = Assertions.assertThrows(ArithmeticException.class)
    }





}

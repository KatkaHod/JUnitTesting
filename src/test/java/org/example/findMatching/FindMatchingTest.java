package org.example.findMatching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class FindMatchingTest {

    /* GENERAL INFO - every test has default value 'public' so no need to write 'public' -> let it 'void'

    In JUnit testing, Assertions.assert methods are used to verify that the expected results match the actual results produced by the code under test.
    Here are some of the most commonly used Assertions.assert methods in JUnit:

    -> assertEquals, checks if two values are equal or NOT -> assertNotEquals
    -> assertTrue, Asserts that a condition is true or NOT -> assertFalse
    -> assertNull, Asserts that an object is null or NOT ->   assertNotNull
    -> assertThrows: Asserts that a specific exception is thrown.
    Assertions.assertThrows(ExpectedException.class, () -> {
    // Code that should throw the exception});

    for more see -> assert methods JUnit

     */

    List <Double> testProvidedData;

    /*  Mandatory -> Data provided for testing -> always use @BeforeEach
     -> Purpose: The purpose of this method is to initialize any necessary variables or states before each test runs.
     -> !!Every test must be independent!! 1 TEST = 1 METHOD
     */

    @BeforeEach
    void setup () {
        System.out.println("Init started");
        testProvidedData = List.of(10.0, 15.45, 5.811, 175.0);
    }

    @Test
    @DisplayName("The value is selected on the basis of the limit set by parameter")
    void findMatching(){
        Double testResult = FindMatching.findMatching(testProvidedData,4.0,9.3);
        Double expected = 5.811;

        Assertions.assertEquals(expected,testResult);
    }

    @Test
    @DisplayName("The value is equal to the number from the list")
    void findMatchingEqualValue(){
        Double testResult = FindMatching.findMatching(testProvidedData,4.0,10.0);
        Double expected = 10.0;

        Assertions.assertEquals(expected,testResult);
    }

    @Test
    void FindMatchingNullvalue () {
        Double testResult = FindMatching.findMatching(testProvidedData,1.0,1.0);
        Double expected = null;

        Assertions.assertEquals(expected,testResult);
    }


}
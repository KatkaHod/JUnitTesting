package org.example.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculationTest {

    /* GENERAL INFO -> every test has default value 'public' so no need to write 'public' -> let it 'void'

     * The title should make it clear which method from the class is being tested
     * -> no need to test methods in main, but just create tests for individual classes
     * -> add in the end: Assertions.assertEquals(expected,actual);

     #If there is an error in the test, check the method and then check if there is an error in the expected value
     */

    @Test
    @DisplayName("Test 2 + 3")
    void testAddition() {
       int actual= Calculation.addition(2,3);
       int expected = 5;

        Assertions.assertEquals(expected,actual);
    }


    @Test
    @DisplayName("Test 5 - 3")
    void testSubtraction() {
        int actual = Calculation.subtraction(5,3);
        int expected = 2;

        Assertions.assertEquals(expected,actual);
    }


    @Test
    @DisplayName("Test 5 * 3")
    void testMultiplication() {
        int actual = Calculation.multiplication(5,3);
        int expected = 15;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test 20 / 5")
    void testDivision(){
        int actual = Calculation.division(20,5);
        int expected = 4;

        Assertions.assertEquals(expected,actual);

    }

    /*
    This test verifies that an ArithmeticException is thrown when dividing by zero,
    Using a lambda expression to execute the division only when assertThrows checks for the exception.
     */

    @Test
    @DisplayName("Test 12 / 0")
    void testDivisionZero() {
        Exception excepted = Assertions.assertThrows(ArithmeticException.class, () -> Calculation.division(12, 0));
        Assertions.assertEquals("/ by zero", excepted.getMessage());
    }




}

package org.example.FindMatching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindMatchingTest {

    List <Double> testProvidedData;

    //mandatory -> Data provided for testing -> always use @BeforeEach
    @BeforeEach
    void setup () {
        testProvidedData = List.of(10.5, 15.45, 5.811, 175.0);
    }

    @Test
    @DisplayName("The value is selected on the basis of the limit set by parameter")
    public void findMatching(){
        Double testResult = FindMatching.findMatching(testProvidedData,4.0,9.3);
        Double expected = 5.811;

        Assertions.assertEquals(expected,testResult);
    }

    @Test
    @DisplayName("The value is equal to the number from the list")
    public void findMatchingEqualValue(){
        Double testResult = FindMatching.findMatching(testProvidedData,4.0,10.0);
        Double expected = 10.0;

        Assertions.assertEquals(expected,testResult);
    }

    @Test
    public void FindMatchingNullvalue () {
        Double testResult = FindMatching.findMatching(testProvidedData,1.0,1.0);
        Double expected = null;

        Assertions.assertEquals(expected,testResult);
    }


}
package org.example.FindMatching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindMatchingTest {

    @Test
    @DisplayName("Test double cisel s limitem mezi 4.0 a 9.3")
    public void findMatching(){
        Double testResult = FindMatching.findMatching(List.of(10.5, 15.45, 5.811, 175.0),4.0,9.3);
        Double expected = 5.811;

        Assertions.assertEquals(expected,testResult);
    }



}
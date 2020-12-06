package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExerciseTest {

    ArrayExercise arrayExercise;

    @BeforeEach
    void setUp() {
        arrayExercise = new ArrayExercise();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSumOfArray() {
        int[] numArray = {1, 2, 3, 4, 5};
        int sum = arrayExercise.arraySum(numArray);
        assertEquals(15, sum);
    }

    @Test
    void testAverageOfArray() {
        int[] numArray = {1, 2, 3, 4, 5};
        double result = arrayExercise.arrayAverage(numArray);
        assertEquals(3, result);
    }

    @Test
    void testMaxNumberOfArray() {
        int[] testArray = {1, 2, 3, 4, 5};
        int result = arrayExercise.maxNumber(testArray);
        assertEquals(5, result);
    }

    @Test
    void testMinNumberOfArray() {
        int[] testArray = {1, 2, 3, 4, 5};
        int outcome = arrayExercise.minNumber(testArray);
        assertEquals(1, outcome);
    }

    @Test
    void testForSumOfHighestNumbers() {
        int[] testArray = {3, 6, 1, 4, 7};
        int output = arrayExercise.possibleHighestCombination(testArray);
        assertEquals(20, output);
    }

    @Test
    void testForSumOfLowestNumbers() {
        int[] testArray = {3, 6, 1, 4, 7};
        int output = arrayExercise.possibleLowestCombination(testArray);
        assertEquals(14, output);
    }
}
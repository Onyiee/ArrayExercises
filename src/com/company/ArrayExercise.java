package com.company;

public class ArrayExercise {
    public int arraySum(int[] array) {
        int sum = 0;
        int counter = 0;
        for (counter = 0; counter < array.length; counter++) {
            sum = sum + array[counter];
        }
        System.out.printf("sum is %d%n ", sum);
        return sum;
    }

    public double arrayAverage(int[] array) {
        int sum = 0;
        double average = 0.0;
        for (int counter = 0; counter < array.length; counter++) {
            sum = sum + array[counter];

        }
        average = (double) sum / array.length;
        return average;
    }

    public int maxNumber(int[] number) {
        int maxNumber = number[0];
        for (int counter = 0; counter < number.length; counter++) {
            if (maxNumber < number[counter]) {
                maxNumber = number[counter];
            }
        }
        return maxNumber;
    }


    public int minNumber(int[] number) {
        int minNumber = number[0];
        for (int counter = 0; counter < number.length; counter++) {
            if (minNumber > number[counter]) {
                minNumber = number[counter];
            }
        }
        return minNumber;
    }


    public int possibleHighestCombination(int[] numbers) {
        int highestPossibleCombination = 0;
        int sum = arraySum(numbers);
        highestPossibleCombination = sum - numbers[0];
        int possibleCombination;
        for (int counter = 0; counter < numbers.length; counter++) {
            possibleCombination = sum - numbers[counter];
            if (highestPossibleCombination < possibleCombination) {
                highestPossibleCombination = possibleCombination;
            }
        }
        return highestPossibleCombination;
    }

    public int possibleLowestCombination(int[] testArray) {
        int lowestPossibleCombination = 0;
        int sum = arraySum(testArray);
        lowestPossibleCombination = sum - testArray[0];
        int possibleCombination;
        for (int counter = 0; counter < testArray.length; counter++) {
            possibleCombination = sum - testArray[counter];
            if (lowestPossibleCombination > possibleCombination) {
                lowestPossibleCombination = possibleCombination;
            }
        }
        return lowestPossibleCombination;
    }

}

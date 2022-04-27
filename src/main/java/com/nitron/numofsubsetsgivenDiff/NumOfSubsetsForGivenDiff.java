package com.nitron.numofsubsetsgivenDiff;

import java.util.Arrays;

public class NumOfSubsetsForGivenDiff {

    int[][] matrix;

    public int getNumOfSubsetsForGivenDiff(int[] arr, int length, int diff) {

        int sum = 0;
        for (int i = 0; i < length; i++)
            sum += arr[i];

        var requiredSum = (sum + diff) / 2;
        matrix = new int[sum + 1][length + 1];
        for (int[] intarr : matrix) {
            Arrays.fill(intarr, -1);
        }

        return countSubsets(arr, length, requiredSum);
    }

    int countSubsets(int[] arr, int n, int sum) {
        if (sum == 0)
            return 1;
        if (n == 0)
            return 0;

        if (arr[n - 1] <= sum) {
            if (matrix[sum][n] == -1) {

                return matrix[sum][n] = countSubsets(arr, n - 1, sum - arr[n - 1]) + countSubsets(arr, n - 1, sum);

            } else {

                return matrix[sum][n];
            }
        } else if (matrix[sum][n] == -1)
            return matrix[sum][n] = countSubsets(arr, n - 1, sum);
        else {

            return matrix[sum][n];
        }
    }

}

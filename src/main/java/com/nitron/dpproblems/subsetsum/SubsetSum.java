package com.nitron.dpproblems.subsetsum;

import java.util.Arrays;

public class SubsetSum {

    Boolean[][] matrix;

    Boolean isSubsetSum(int N, int[] arr, int sum) {

        matrix = new Boolean[N + 1][sum + 1];

        for (Boolean[] arr1 : matrix) {
            Arrays.fill(arr1, null);
        }

        return checkSubsetSum(arr, sum, N);
    }

    Boolean checkSubsetSum(int[] arr, int sum, int n) {
        if (sum == 0)
            return true;
        if (n == 0)
            return false;
        if (matrix[n][sum] != null)
            return matrix[n][sum];

        if (arr[n - 1] <= sum) {
                return matrix[n][sum] = checkSubsetSum(arr, sum - arr[n - 1], n - 1) || checkSubsetSum(arr, sum, n - 1);
        } else {
                return  matrix[n][sum] =  checkSubsetSum(arr, sum, n - 1);
        }
    }
}

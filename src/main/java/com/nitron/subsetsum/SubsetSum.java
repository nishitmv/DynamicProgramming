package com.nitron.subsetsum;

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

        if (arr[n - 1] <= sum) {

            if (matrix[n][sum] != null) {
                var val = matrix[n][sum];

                System.out.println("FOUND : " + n + " " + sum + " " + " " + val);
                return val;
            } else {

                boolean val = checkSubsetSum(arr, sum - arr[n - 1], n - 1) || checkSubsetSum(arr, sum, n - 1);
                matrix[n][sum] = val;
                System.out.println("MATRIX ");
                for (Boolean[] arr1 : matrix) {
                    for (Boolean val1 : arr1)
                        System.out.print(val1 + " ");
                    System.out.println();
                }
                return val;
            }
        } else {
            boolean val = checkSubsetSum(arr, sum, n - 1);
            matrix[n][sum] = val;
            for (Boolean[] arr1 : matrix) {
                for (Boolean val1 : arr1)
                    System.out.print(val1 + " ");
                System.out.println();
            }
            return val;
        }
    }
}

package com.nitron.dpproblems.unboundedknapsack;

import java.util.Arrays;

public class UnboundedKnapsack {
    int[][] matrix;

    public UnboundedKnapsack(int size, int n) {
        matrix = new int[n + 1][size + 1];
        for (int[] arr : matrix)
            Arrays.fill(arr, -1);
    }

    public int fillKnapsack(int[] weights, int[] values, int size, int n) {
        if (size == 0 || n == 0)
            return 0;

        if (weights[n - 1] <= size) {
            int val;
            if (matrix[n][size] != -1) {
                val = matrix[n][size];
                System.out.println("Found : " + val);
            } else {
                val = Math.max(values[n - 1] + fillKnapsack(weights, values, size - weights[n - 1], n), fillKnapsack(weights, values, size, n - 1));
                matrix[n][size] = val;
            }
            return val;
        } else {
            int val = fillKnapsack(weights, values, size, n - 1);
            matrix[n][size] = val;
            return val;
        }
    }

}

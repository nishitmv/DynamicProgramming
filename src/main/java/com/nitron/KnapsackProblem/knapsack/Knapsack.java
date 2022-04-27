package com.nitron.KnapsackProblem.knapsack;

public class Knapsack {
    Integer[][] matrix;

    public Knapsack(int size, int n) {
        matrix = new Integer[n + 1][size + 1];
    }

    public int fillKnapsack(int[] weights, int[] values, int size, int n) {
        if (size == 0 || n == 0)
            return 0;
        if (matrix[n][size] != null)
            return matrix[n][size];

        if (weights[n - 1] <= size) {
            return matrix[n][size] = Math.max(values[n - 1] + fillKnapsack(weights, values, size - weights[n - 1], n - 1), fillKnapsack(weights, values, size, n - 1));

        } else {
            return matrix[n][size] = fillKnapsack(weights, values, size, n - 1);

        }
    }
}

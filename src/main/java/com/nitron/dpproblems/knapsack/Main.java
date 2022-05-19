package com.nitron.dpproblems.knapsack;

public class Main {

    public static void main(String[] args) {

        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};
        int size = 7;

        Knapsack knapsack = new Knapsack(size, weights.length);
        System.out.println(knapsack.fillKnapsack(weights, values, 7, weights.length));

    }

}

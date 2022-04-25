package com.nitron.unboundedknapsack;

public class Main {

    public static void main(String[] args) {

        int[] weights = {1,3,4,5};
        int[] values = {1,4,5,7};
        int size = 7;

        UnboundedKnapsack unboundedKnapsack = new UnboundedKnapsack(size, weights.length);
        System.out.println(unboundedKnapsack.fillKnapsack(weights,values,7, weights.length));

    }

}

package com.nitron.dpproblems.minNumofCoins;


public class Main {

    public static void main(String[] args) {

        //int[] coins = {9, 6, 5, 1};
        //int[] coins = {25, 10, 5};
        int[] coins = {2, 5, 10, 1};
        int sum = 27;

        //int[] coins = {1,2};
        //int sum = 2;

        System.out.println(new MinCoinsCalc().coinChange(coins, sum));

    }
}

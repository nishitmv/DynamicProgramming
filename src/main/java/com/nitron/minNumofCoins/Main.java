package com.nitron.minNumofCoins;


public class Main {

    public static void main(String[] args) {

        int[] coins = {2, 5, 3, 6};

        System.out.println(new MinCoinsCalc().calculateMinCoins(coins, coins.length, 10));
    }
}

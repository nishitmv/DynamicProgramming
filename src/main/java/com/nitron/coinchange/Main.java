package com.nitron.coinchange;

public class Main {

    public static void main(String[] args) {

        int[] coins = {2, 5, 3, 6};

        System.out.println(new CoinChangeCalc().calculateCoinChange(coins, coins.length, 10));
    }
}

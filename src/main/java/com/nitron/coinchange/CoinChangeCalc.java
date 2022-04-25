package com.nitron.coinchange;

public class CoinChangeCalc {

    public int calculateCoinChange(int[] coins, int n, int sum) {

        if(sum ==0)
            return 1;
        if(n==0)
            return 0;

        if(coins[n-1]<=sum)
        {
            return calculateCoinChange(coins, n, sum - coins[n-1]) + calculateCoinChange(coins, n-1, sum );
        }
        else
            return calculateCoinChange(coins, n-1, sum );

    }
}

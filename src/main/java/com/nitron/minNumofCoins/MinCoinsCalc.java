package com.nitron.minNumofCoins;
// Based on unbounded knapsack  .
public class MinCoinsCalc {

    Integer[][] matrix;

    public int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        if (coins.length == 1) // IF ITS A SINGLE COIN
            return amount % coins[0] == 0 ? amount / coins[0] : -1;
        int n = coins.length;
        matrix = new Integer[n + 1][amount + 1];

        for (int i = 0; i < n + 1; i++)
            for (int j = 0; j < amount + 1; j++) {
                if (i == 0)
                    matrix[i][j] = Integer.MAX_VALUE - 1; // No Coins , coins array size is 0
                else if (j == 0) // sum is zero
                    matrix[i][j] = 0;
                else if (i == 1) {
                    if (j % coins[0] == 0) // For the first coin check if sum can be multiples of first coin.
                        matrix[i][j] = j / coins[0];
                    else
                        matrix[i][j] = Integer.MAX_VALUE - 1;
                }
            }
        int result = calculateMinCoins(coins, n, amount);
        return result == Integer.MAX_VALUE - 1 ? -1 : result;
    }

    public int calculateMinCoins(int[] coins, int n, int sum) {

        if (sum == 0)
            return 0;
        if (n == 0)
            return 1;
        if (matrix[n][sum] != null)
            return matrix[n][sum];
        if (coins[n - 1] <= sum) {
            return matrix[n][sum] = Math.min(1 + calculateMinCoins(coins, n, sum - coins[n - 1]), calculateMinCoins(coins, n - 1, sum));
        } else
            return matrix[n][sum] = calculateMinCoins(coins, n - 1, sum);

    }
}

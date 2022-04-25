package com.nitron.minNumofCoins;

public class MinCoinsCalc {

    int[][] matrix ;
    public int coinChange(int[] coins, int amount) {
        if(amount==0)
            return 0;
        if(coins.length==1)
            return amount%coins[0]==0 ? amount/coins[0] : -1;
        int n = coins.length;
        matrix = new int[n+1][amount+1];

        for(int i=0;i<n+1;i++)
            for(int j=0;j<amount+1;j++) {
                if (i == 0)
                    matrix[i][j] = Integer.MAX_VALUE - 1;
                else if (j == 0 )
                    matrix[i][j] = 0;
                else if (i == 1) {
                    if(j%coins[0]==0)
                        matrix[i][j] = j/coins[0];
                    else
                        matrix[i][j] = Integer.MAX_VALUE - 1;
                }
                else matrix[i][j] = -1;

            }
        int result =calculateMinCoins(coins, n, amount);
        return result == Integer.MAX_VALUE - 1 ? -1 :result;
    }

    public int  calculateMinCoins(int[] coins, int n, int sum) {

        if(sum==0)
            return 0;
        if(n==0)
            return 1;

        if(coins[n-1]<=sum )
        {
            if(matrix[n][sum]!=-1)
                return matrix[n][sum];
            else
                return matrix[n][sum] = Math.min(1+calculateMinCoins(coins, n, sum - coins[n-1]), calculateMinCoins(coins, n-1, sum));
        }
        else
        if(matrix[n][sum]!=-1)
            return matrix[n][sum];
        else
            return matrix[n][sum] = calculateMinCoins(coins, n-1, sum);

    }
}

package com.nitron.dpproblems.MatrixChainMultiplicationFORMAT;

public class MatrixChainMultiFormat {
    int ans =0;
    public int calc(int[] arr, int i, int j) {

        if(i>=j)
            return 0;

        for(int k =i ; k<j; k++) {
           int tempAns =  calc(arr, i, k) +calc(arr, k+1 , j);

           ans = Math.max(ans, tempAns);
        }
        return ans;
    }
}

package com.nitron.MatrixChainMultiplication;

public class MatrixChainMulti {

    public int calc(int[] arr, int i, int j) {

        if(i>=j) // Matrix requires i<j ; i==j means no matrix . i > j is impossible .
            return 0;
        int ans =Integer.MAX_VALUE;
        for(int k =i;k<j;k++)
        {
            // i to k + k+1 to j + mid ( product start, mid and end)
            int tempans = calc(arr, i, k)+ calc(arr, k+1, j)+(arr[i-1]*arr[k]*arr[j]); // k can only be less than j , k==j is no matrix .
            ans = Math.min(tempans, ans);
        }
        return ans;
    }
}

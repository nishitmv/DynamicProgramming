package com.nitron.leetcode.longestIncreasingSubsequence;

public class LISCalc {

    int[] result;

    public int calcLIS(int[] arr) {

        result = new int[arr.length];

        for(int i =0;i<arr.length;i++)
            result[i] =1; // every element is a subsequence of size 1

        return calcLIS(arr, arr.length);

    }

    private int calcLIS(int[] arr, int n) {

        if(n==0)
            return 0;
        if(n==1)
            return 1;

        for(int i =0; i<n; i++)
        {
            for(int j = i+1;j<n; j++)
            {
                if(arr[j]>arr[i])
                    result[j]=Math.max(result[i]+1, result[j]); // result[i] contains max incr subsequnce till i .so does result[j] . Either choose result[i]+1 or result[j]
            }
        }
        int max =0;
        for (int j : result) {
            max = Math.max(max, j);
        }

        return max;
    }
}

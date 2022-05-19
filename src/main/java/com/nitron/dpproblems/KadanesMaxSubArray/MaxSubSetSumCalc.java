package com.nitron.dpproblems.KadanesMaxSubArray;

import lombok.Getter;

public class MaxSubSetSumCalc {
@Getter
int sum =Integer.MIN_VALUE;

    public void calcMaxSubSetSum(int[] arr) {

         calcMaxSubSetSum(arr, arr.length);
    }

    private int calcMaxSubSetSum(int[] arr, int n) {

        if(n==0)
            return 0;

        int val =Math.max(arr[n-1]+ calcMaxSubSetSum(arr, n-1), calcMaxSubSetSum(arr, n-1) );
        sum = Math.max(sum, val);
        return val;

        }
}
